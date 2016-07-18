package biblioteca.objetos;

/**
 * Created by German Jongewaard de Boer 
 */

import biblioteca.listas.Categoria;

import java.util.LinkedList;

public class Libro extends Item {

    private String editorial;
    private String autor;

    public boolean buscar( String buscar) {
        String buscarLower=buscar.toLowerCase();
        boolean res=editorial.toLowerCase().contains(buscarLower) | autor.toLowerCase().contains(buscarLower) | getTitulo().toLowerCase().contains(buscarLower);
        return res;
    }

    public Libro(String titulo, String autor, String editorial) {
        super(titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString(){
        return " Título = " + super.getTitulo() + "\n Autor = " + autor + "\n Editorial = " + editorial;      
      }

    @Override
    public String exportar() {
        String strExportar="";
        return "LIBRO," + getTitulo() + "," + autor + "," + editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}