package interfaz;

/**
 * Created by German Jongewaard de Boer && @author Philip
 */

import biblioteca.persistencia.Archivo;
import interfaz.gui.FrmPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Programa {

    public static void main(String[] args) {

        Archivo.cargar();

        try {
            // Set cross-platform Java L&F (also called "Metal")
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }

        FrmPrincipal form = new FrmPrincipal();
        form.setVisible(true);
    }
}
