package SIGPROD2.Modelo;

import java.util.ArrayList;

/**
 * Esta clsse representa um Elo de Tipo K
 *
 * @author Rafael Casa
 */
public class EloK {

    private int correnteNominal;
    private boolean preferencial;
    private ArrayList<PontoCurva> curvaDeMinimaFusao,
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

    public EloK(int correnteNominal, boolean preferencial, ArrayList<PontoCurva> curvaDeMinimaFusao, ArrayList<PontoCurva> curvadeMaximaInterrupcao) {
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

    public ArrayList<PontoCurva> getCurvaDeMinimaFusao() {
        return curvaDeMinimaFusao;
    }

    public void setCurvaDeMinimaFusao(ArrayList<PontoCurva> curvaDeMinimaFusao) {
        this.curvaDeMinimaFusao = curvaDeMinimaFusao;
    }

    public ArrayList<PontoCurva> getCurvaDeMaximaInterrupcao() {
        return curvaDeMaximaInterrupcao;
    }

    public void setCurvaDeMaximaInterrupcao(ArrayList<PontoCurva> curvadeMaximaInterrupcao) {
        this.curvaDeMaximaInterrupcao = curvadeMaximaInterrupcao;
    }

    @Override
    public String toString() {
        return String.valueOf(this.correnteNominal);
    }
}
