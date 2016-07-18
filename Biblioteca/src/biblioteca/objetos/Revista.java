package biblioteca.objetos;

/**
 * Created by German Jongewaard de Boer 
 */

public class Revista extends Item {

    private String genero;
    private String ano;
    private String edicion;
    
    public Revista(String nombre,String genero,String edicion, String ano) {
        super(nombre);
        this.genero = genero;
        this.edicion = edicion;
        this.ano = ano;
    }
    
    @Override
    public boolean buscar(String buscar) {
        return genero.contains(buscar) | ano.contains(buscar) | getTitulo().contains(buscar) | edicion.contains(buscar);
    }
    
    @Override
    public String toString(){
        return " Nombre = " + super.getTitulo() + "\n Género = " + genero + "\n Año = " + ano + "\n Edición = " + edicion;
    }

    @Override
    public String exportar() {
        return "REVISTA," + getNombre()  + "," + getGenero() + "," + getEdicion()+","+getAno();
    }

    public void setNombre(String nombre){
        setTitulo(nombre);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAño(String ano) {
        this.ano = ano;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override   
    public String getNombre() {
        return getTitulo();
    }

    public String getGenero() {
        return genero;
    }

    public String getAno() {
        return ano;
    }

    public String getEdicion() {
        return edicion;
    }
   
}