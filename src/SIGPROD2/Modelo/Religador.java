package SIGPROD2.Modelo;

/**
 *
 * @author Rafael Casa
 * @version 19/05/16
 */
public interface Religador {

    int DIGITAL = 0;
    int ELETROMECANICO = 1;
    int INVERSA_FASE = 0;
    int INVERSA_NEUTRO = 1;
    int DEFINIDO_FASE = 2;
    int DEFINIDO_NEUTRO = 3;
    boolean CURVA_RAPIDA = true;
    boolean CURVA_LENTA = false;

    double getFatorInicio(int tipo);

    void setFatorInicio(double fator, int tipo);

    String getFabricante();

    void setFabricante(String fabricante);

    String getModelo();

    void setModelo(String modelo);

    int getTipo();

    boolean isDigital();

    int getCodigo();

    void setCodigo(int codigo);
    
    boolean existeCurva(int codigo);

    void setExisteCurva(int codigo, boolean existeCurva);
}
