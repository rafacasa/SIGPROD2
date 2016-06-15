package SIGPROD2.Modelo;

import java.util.List;
import java.util.ArrayList;

/**
 * Esta clsse representa um Elo de Tipo K
 *
 * @author Rafael Casa
 * @version 25/03/2016
 */
public class EloK implements Curvas {

    private int correnteNominal;
    private boolean preferencial;
    private List<PontoCurva> curvaDeMinimaFusao,
            curvaDeMaximaInterrupcao;

    public EloK(int correnteNominal, boolean preferencial) {
        this.correnteNominal = correnteNominal;
        this.preferencial = preferencial;
        this.curvaDeMinimaFusao = new ArrayList<>();
        this.curvaDeMaximaInterrupcao = new ArrayList<>();
    }

    public EloK() {
        this.curvaDeMinimaFusao = new ArrayList<>();
        this.curvaDeMaximaInterrupcao = new ArrayList<>();
    }

    public EloK(int correnteNominal, boolean preferencial, List<PontoCurva> curvaDeMinimaFusao, List<PontoCurva> curvadeMaximaInterrupcao) {
        this.correnteNominal = correnteNominal;
        this.preferencial = preferencial;
        this.curvaDeMinimaFusao = curvaDeMinimaFusao;
        this.curvaDeMaximaInterrupcao = curvadeMaximaInterrupcao;
    }

    public void addPontoDaCurvaDeMinimaFusao(PontoCurva ponto) {
        this.curvaDeMinimaFusao.add(ponto);
    }

    public void addPontoDaCurvaDeMaximaInterrupcao(PontoCurva ponto) {
        this.curvaDeMaximaInterrupcao.add(ponto);
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

    public List<PontoCurva> getCurvaDeMinimaFusao() {
        return curvaDeMinimaFusao;
    }

    public void setCurvaDeMinimaFusao(List<PontoCurva> curvaDeMinimaFusao) {
        this.curvaDeMinimaFusao = curvaDeMinimaFusao;
    }

    public List<PontoCurva> getCurvaDeMaximaInterrupcao() {
        return curvaDeMaximaInterrupcao;
    }

    public void setCurvaDeMaximaInterrupcao(List<PontoCurva> curvadeMaximaInterrupcao) {
        this.curvaDeMaximaInterrupcao = curvadeMaximaInterrupcao;
    }

    @Override
    public String toString() {
        return String.valueOf(this.correnteNominal);
    }

    @Override
    public String getTitulo() {
        return "Grafico do Elo " + this.getCorrenteNominal();
    }

    @Override
    public int getQtdCurvas() {
        return 2;
    }

    @Override
    public String getNomeCurva(int index) {
        switch (index) {
            case 0:
                return "Curva de Mínima Fusão";
            case 1:
                return "Curva de Máxima Interrupção";
            default:
                throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    @Override
    public List<PontoCurva> getCurva(int index) {
        switch (index) {
            case 0:
                return getCurvaDeMinimaFusao();
            case 1:
                return getCurvaDeMaximaInterrupcao();
            default:
                throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    @Override
    public java.awt.Paint getCurvaPaint(int index) {
        switch (index) {
            case 0:
                return java.awt.Color.GREEN;
            case 1:
                return java.awt.Color.RED;
            default:
                throw new ArrayIndexOutOfBoundsException(index);
        }
    }
}
