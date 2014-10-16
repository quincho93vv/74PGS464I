
package Controlador;

import DAO.DAO;
import Vista.FileTypeFilter;
import java.io.File;
import java.util.ArrayList;
import java.util.stream.IntStream;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

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
    
      public void useChooser(JFreeChart chart) {
        File f = null;
        JFileChooser jfc = new JFileChooser();//"images", "jpg", "gif", "png"
        FileFilter f1 = new FileTypeFilter(".jpg", "Images");
        FileFilter f2 = new FileTypeFilter(".gif", "Images");
        FileFilter f3 = new FileTypeFilter(".png", "Images");
        jfc.addChoosableFileFilter(f1);
        jfc.addChoosableFileFilter(f2);
        jfc.addChoosableFileFilter(f3);
        int retVal = jfc.showSaveDialog(null);
      
        if (retVal == JFileChooser.APPROVE_OPTION) {  
           f= jfc.getSelectedFile();
            String path= f.getAbsolutePath();
             String  ext=  jfc.getFileFilter().getDescription();
            f= new File(path+ ext);
                /* String ext = Utils.getExtension(f);
                if (ext != null) {
                JOptionPane.showMessageDialog(null, "Add an image extension");
                if (Utils.permite(ext) == false) {
                JOptionPane.showMessageDialog(null,
                "Add an image extension(png, jpg, gif)");
                } else {
                useChooser(chart);
                }
                } else {
                useChooser(chart);
                }*/            
        try {
            if (chart != null) {
                System.out.println(f.getAbsolutePath());
           
                ChartUtilities.saveChartAsJPEG(f, chart, 500, 300);
            } else {
                JOptionPane.showMessageDialog(null, "El gráfico no se ha cargado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problema al crear el gráfico");
        }
        }
    }
    
}
