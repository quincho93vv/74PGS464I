
package Controlador;

import DAO.DAO;
import java.util.ArrayList;
import java.util.stream.IntStream;
import javax.swing.JList;

public class Controlador {
    private DAO dao;

    public Controlador() {
        try {
            this.dao = new DAO();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public DAO getDao() {
        return dao;
    }
    
    public ArrayList<String> getJListData(JList l) {
        int[] selectedIx = l.getSelectedIndices();
        ArrayList<String> aux = new ArrayList();
        IntStream.range(0, selectedIx.length).forEach(
                (a) -> aux.add(l.getModel().getElementAt(selectedIx[a]).toString())
        );
        return aux;
    }
    
}
