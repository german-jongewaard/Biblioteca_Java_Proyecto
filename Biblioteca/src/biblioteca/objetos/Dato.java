package biblioteca.objetos;

/**
 * Created by German Jongewaard de Boer  
 */

import biblioteca.constantes.TipoDisco;

public class Dato extends DiscoCompacto {

    public Dato(TipoDisco tipo, String genero, String ano, String edicion, String titulo) {
        super(tipo, genero, ano, edicion, titulo);
    }

    @Override
    public String exportar() {
        return "DATO," + getTitulo() + "," + getGenero() + "," + getAno() + "," + getEdicion() + "," + getTipo();
    }

    @Override
    public boolean buscar(String buscar) {
        return getTitulo().contains(buscar) | getEdicion().contains(buscar) | getGenero().contains(buscar) | getAno().contains(buscar);
    }
    
    public String toString(){
        return "Nombre = " + super.getTitulo() + "\n Género = " + getGenero() + "\n Año = " + getAno() +"\n Tipo Disco = "+getTipoDisco();
    }
    
}