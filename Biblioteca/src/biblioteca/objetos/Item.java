package biblioteca.objetos;

/**
 * Created by German Jongewaard de Boer 
 */

import biblioteca.listas.Categoria;
import biblioteca.listas.ListaCategoria;
 
import java.io.Serializable;

public abstract class Item implements Serializable {

    private String titulo;
    private ListaCategoria lc;
    
 

    //Puede implementar alguna redefinicion de metodos como equals en las clases heredadas
    public abstract boolean buscar(String buscar);

    protected Item(String titulo) {
        this.titulo = titulo;
        lc = new ListaCategoria();
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return " { Título = " + titulo + " } ";
    }

    public boolean agregarCategoria(Categoria categoria) {
        lc.add(categoria);
        categoria.add(this);
        return true;
    }

    public boolean borrarCategoria(Categoria categoria) {
        lc.remove(categoria);
        categoria.remove(this);
        return true;
    }
     

    public abstract String exportar();

    protected String exportarCategorias() {
        String strExportar = "";
        for (Categoria c : lc) {
            strExportar += "," + c;
        }
        return strExportar;
    }

    public ListaCategoria getCategorias() {
        ListaCategoria lcc = new ListaCategoria();
        for(Categoria l: lc){
            lcc.add(l);
        }
        return lcc;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
    

}
