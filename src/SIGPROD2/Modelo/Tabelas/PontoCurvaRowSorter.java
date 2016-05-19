/*
 * Classe criada para resolver o bug da ordenação da tabela na janela de Elo tipo K
 * Reescrita do método toogleSortOrder para ordenar sem bugs.
 * and open the template in the editor.
 */
package SIGPROD2.Modelo.Tabelas;

import SIGPROD2.Modelo.PontoCurva;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Lucas
 * @version 21/03/2016
 */
public class PontoCurvaRowSorter extends TableRowSorter<PontoCurvaTableModel> {

    private static int cont;// gambiarra para contar os cliques para ordenar
    PontoCurvaTableModel model;// para pegar a referência model para usar no método de ordenação

    public PontoCurvaRowSorter(PontoCurvaTableModel model) {
        super(model);
        this.model = model;
        cont = 0;
    }

    @Override
    public void toggleSortOrder(int column) {
        ArrayList<PontoCurva> lista = this.model.getArrayList();
        if (cont >= 0) {
            cont++;
        }
        if (cont % 2 == 0) {// CADA VEZ QUE DÁ UM CLIQUE, ALTERA A ORDEM DE ORDENAÇÃO, ENTRE CRESCENTE E DECRESCENTE
            Collections.sort(lista, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    PontoCurva p1 = (PontoCurva) o1;
                    PontoCurva p2 = (PontoCurva) o2;
                    return p1.getCorrente() < p2.getCorrente() ? -1 : (p1.getCorrente() > p2.getCorrente() ? +1 : 0);
                }
            });
        }else{
             Collections.sort(lista, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    PontoCurva p1 = (PontoCurva) o1;
                    PontoCurva p2 = (PontoCurva) o2;
                    return p1.getCorrente() < p2.getCorrente() ? +1 : (p1.getCorrente() > p2.getCorrente() ? -1 : 0);
                }
            });
        }
        this.model.setArrayList(lista);
    }

}
