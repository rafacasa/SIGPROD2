package SIGPROD2.Modelo;

import java.util.ArrayList;

/**
 * Esta clsse representa um Elo de Tipo K
 * @author Rafael Casa
 */
public class EloK {
    private int correnteNominal;
    private boolean preferencial;
    private int id;
    private ArrayList<PontoCurva> curvaDeMinimaFusao,
                                  curvadeMaximaInterrupcao;

    public EloK(int correnteNominal, boolean preferencial) {
        this.correnteNominal = correnteNominal;
        this.preferencial = preferencial;
        this.curvaDeMinimaFusao = new ArrayList<>();
        this.curvadeMaximaInterrupcao = new ArrayList<>();
    }

    public EloK() {
        this.curvaDeMinimaFusao = new ArrayList<>();
        this.curvadeMaximaInterrupcao = new ArrayList<>();
    }
    

    public EloK(int correnteNominal, boolean preferencial, int id, ArrayList<PontoCurva> curvaDeMinimaFusao, ArrayList<PontoCurva> curvadeMaximaInterrupcao) {
        this.correnteNominal = correnteNominal;
        this.preferencial = preferencial;
        this.id = id;
        this.curvaDeMinimaFusao = curvaDeMinimaFusao;
        this.curvadeMaximaInterrupcao = curvadeMaximaInterrupcao;
        this.curvaDeMinimaFusao = new ArrayList<>();
        this.curvadeMaximaInterrupcao = new ArrayList<>();
    }
    
    public void addPontoDaCurvaDeMinimaFusao(PontoCurva ponto)
    {
        this.curvaDeMinimaFusao.add(ponto);
    }
    
    public void addPontoDaCurvaDeMaximaInterrupcao(PontoCurva ponto)
    {
        this.curvadeMaximaInterrupcao.add(ponto);
    }

    public int getCorrenteNominal() {
        return correnteNominal;
    }

    public void setCorrenteNominal(int correnteNominal) {
        this.correnteNominal = correnteNominal;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<PontoCurva> getCurvaDeMinimaFusao() {
        return curvaDeMinimaFusao;
    }

    public void setCurvaDeMinimaFusao(ArrayList<PontoCurva> curvaDeMinimaFusao) {
        this.curvaDeMinimaFusao = curvaDeMinimaFusao;
    }

    public ArrayList<PontoCurva> getCurvadeMaximaInterrupcao() {
        return curvadeMaximaInterrupcao;
    }

    public void setCurvadeMaximaInterrupcao(ArrayList<PontoCurva> curvadeMaximaInterrupcao) {
        this.curvadeMaximaInterrupcao = curvadeMaximaInterrupcao;
    }
    
}
