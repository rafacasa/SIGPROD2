package SIGPROD2.Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Rafael Casa
 * @version 01/06/2016
 */
public class ReligadorEletromecanico implements Religador {

    private String fabricante;
    private String modelo;
    private int codigo;
    private List<Double> fatorInicio;
    //private List<Double> tempoReligamento;
    private boolean[] existeCurva;
    private Map<Double, List<DialDeTempoMecanico>> mapaFaseRapidaPickupTempo;
    private Map<Double, List<DialDeTempoMecanico>> mapaNeutroRapidaPickupTempo;
    private Map<Double, List<DialDeTempoMecanico>> mapaFaseLentaPickupTempo;
    private Map<Double, List<DialDeTempoMecanico>> mapaNeutroLentaPickupTempo;
    private List<List<Double>> correntePickup;
    private List<Double> tempoDefinidaFaseLenta;
    private List<Double> tempoDefinidaNeutraLenta;
    private List<Double> tempoDefinidaFaseRapida;
    private List<Double> tempoDefinidaNeutraRapida;

    /*private int qtdPontosFase;
    private int qtdPontosNeutro;*/
    public ReligadorEletromecanico() {
        this.fatorInicio = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.correntePickup = Arrays.asList(null, null, null, null);
        this.mapaFaseLentaPickupTempo = new TreeMap<>();
        this.mapaFaseRapidaPickupTempo = new TreeMap<>();
        this.mapaNeutroLentaPickupTempo = new TreeMap<>();
        this.mapaNeutroRapidaPickupTempo = new TreeMap<>();
        //this.tempoReligamento = new ArrayList<>();
        this.tempoDefinidaFaseLenta = new ArrayList<>();
        this.tempoDefinidaFaseRapida = new ArrayList<>();
        this.tempoDefinidaNeutraRapida = new ArrayList<>();
        this.tempoDefinidaNeutraLenta = new ArrayList<>();
        this.existeCurva = new boolean[4];
    }

    public void addTempoDeAtuacao(int tipo, ArrayList<Double> a, boolean rapida) {
        if (tipo == Religador.DEFINIDO_FASE) {
            if (rapida) {
                this.tempoDefinidaFaseRapida = a;
            } else {
                this.tempoDefinidaFaseLenta = a;
            }
        } else {
            if (rapida) {
                this.tempoDefinidaNeutraRapida = a;
            } else {
                this.tempoDefinidaNeutraLenta = a;
            }
        }
        
        
    }
    
    public void addCorrentePickup(List<Double> corrente, int tipo) {
        this.correntePickup.set(tipo, new ArrayList<>(corrente));
        if (tipo == INVERSA_FASE) {
            for (Double c : corrente) {
                this.mapaFaseLentaPickupTempo.put(c, new ArrayList<>());
                this.mapaFaseRapidaPickupTempo.put(c, new ArrayList<>());
            }
        } else if (tipo == INVERSA_NEUTRO) {
            for (Double c : corrente) {
                this.mapaNeutroLentaPickupTempo.put(c, new ArrayList<>());
                this.mapaNeutroRapidaPickupTempo.put(c, new ArrayList<>());
            }
        }
    }

    public void removeCorrentePickup(int tipo) {
        this.correntePickup.set(tipo, new ArrayList<>());
        if (tipo == INVERSA_FASE) {
            this.mapaFaseRapidaPickupTempo = new TreeMap<>();
            this.mapaFaseLentaPickupTempo = new TreeMap<>();
        } else {
            this.mapaNeutroRapidaPickupTempo = new TreeMap<>();
            this.mapaNeutroLentaPickupTempo = new TreeMap<>();
        }
    }

    public void addDialDeTempo(int tipo, boolean rapida, double corrente, double dial, ArrayList<PontoCurva> pontos) {
        DialDeTempoMecanico dm = new DialDeTempoMecanico(dial, pontos);
        List<DialDeTempoMecanico> array;

        if (tipo == INVERSA_FASE) {
            if (rapida) {
                array = this.mapaFaseRapidaPickupTempo.get(corrente);
                array.add(dm);
                this.mapaFaseRapidaPickupTempo.put(corrente, array);
                //this.qtdPontosFase += pontos.size();
            } else {
                array = this.mapaFaseLentaPickupTempo.get(corrente);
                array.add(dm);
                this.mapaFaseLentaPickupTempo.put(corrente, array);
                //this.qtdPontosFase += pontos.size();
            }

        } else if (rapida) {
            array = this.mapaNeutroRapidaPickupTempo.get(corrente);
            array.add(dm);
            this.mapaNeutroRapidaPickupTempo.put(corrente, array);
            //this.qtdPontosNeutro += pontos.size();
        } else {
            array = this.mapaNeutroLentaPickupTempo.get(corrente);
            array.add(dm);
            this.mapaNeutroLentaPickupTempo.put(corrente, array);
            //this.qtdPontosNeutro += pontos.size();
        }
    }

    public void removeDialDeTempo(int tipo, boolean rapida) {
        if (tipo == Rele.INVERSA_FASE) {
            if (rapida) {
                this.mapaFaseRapidaPickupTempo = new TreeMap<>();
                //this.qtdPontosFase = 0;
            } else {
                this.mapaFaseLentaPickupTempo = new TreeMap<>();
                //this.qtdPontosFase = 0;
            }

        } else if (rapida) {
            this.mapaNeutroRapidaPickupTempo = new TreeMap<>();
            //this.qtdPontosNeutro = 0;
        } else {
            this.mapaNeutroLentaPickupTempo = new TreeMap<>();
            //this.qtdPontosFase = 0;
        }
    }

    public List<Double> getDialDeTempo(int tipo, boolean rapida, double corrente) {
        List<Double> dial = new ArrayList<>();
        List<DialDeTempoMecanico> diais;
        if (tipo == INVERSA_FASE) {
            if (rapida) {
                diais = this.mapaFaseRapidaPickupTempo.get(corrente);
            } else {
                diais = this.mapaFaseLentaPickupTempo.get(corrente);
            }
        } else if (rapida) {
            diais = this.mapaNeutroRapidaPickupTempo.get(corrente);
        } else {
            diais = this.mapaNeutroLentaPickupTempo.get(corrente);
        }

        for (DialDeTempoMecanico d : diais) {
            dial.add(d.getDial());
        }
        return dial;
    }

    public List<PontoCurva> getPontosDialDeTempo(double corrente, double dial, int tipo, boolean rapida) {
        List<DialDeTempoMecanico> dt;
        if (tipo == Rele.INVERSA_FASE) {
            if (rapida) {
                dt = this.mapaFaseRapidaPickupTempo.get(corrente);
            } else {
                dt = this.mapaFaseLentaPickupTempo.get(corrente);
            }
        } else if (rapida) {
            dt = this.mapaNeutroRapidaPickupTempo.get(corrente);
        } else {
            dt = this.mapaNeutroLentaPickupTempo.get(corrente);
        }

        for (DialDeTempoMecanico d : dt) {
            if (d.getDial() == dial) {
                return d.getPontosCurva();
            }
        }
        return null;
    }

    @Override
    public double getFatorInicio(int tipo) {
        return this.fatorInicio.get(tipo);
    }

    @Override
    public void setFatorInicio(double fator, int tipo) {
        this.fatorInicio.set(tipo, fator);
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }

    @Override
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getTipo() {
        return Religador.ELETROMECANICO;
    }

    @Override
    public boolean isDigital() {
        return false;
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean existeCurva(int codigo) {
        return this.existeCurva[codigo];
    }

    @Override
    public void setExisteCurva(int codigo, boolean existeCurva) {
        this.existeCurva[codigo] = existeCurva;
    }

}
