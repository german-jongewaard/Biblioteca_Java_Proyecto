package biblioteca.persistencia;

/**
 * Created by German Jongewaard de Boer 
 */

import biblioteca.listas.Categoria;
import biblioteca.listas.ListaCategoria;
import biblioteca.objetos.Item;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exportar {

    ListaCategoria mCategorias;
    String filename;

    public Exportar(String filename) {
        this.mCategorias = Archivo.getDatos().getCategorias();
        this.filename = filename;
        exportar();
    }

    private void exportar() {

        File fo = new File(filename);
        FileWriter fw = null;
        PrintWriter out = null;
        String newline = System.getProperty("line.separator");
        try {
            fw = new FileWriter(fo);
            out = new PrintWriter(new BufferedWriter(fw));
            Categoria def = mCategorias.get(0);
            for (Item i : def) {
                fw.write(i.exportar() + newline);
                for (Categoria c : i.getCategorias()) {
                    fw.write(c.exportar() + newline);
                }
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                fw.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
