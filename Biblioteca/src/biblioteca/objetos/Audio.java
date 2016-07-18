package biblioteca.objetos;

/**
 * Created by German Jongewaard de Boer 
 */

import biblioteca.constantes.TipoDisco;

public class Audio extends DiscoCompacto {

    public Audio(TipoDisco tipo, String genero, String ano, String edicion, String titulo) {
        super(tipo, genero, ano, edicion, titulo);
    }

    @Override
    public boolean buscar(String buscar) {
        return getTitulo().contains(buscar) | getEdicion().contains(buscar) | getGenero().contains(buscar) | getAno().contains(buscar);
    }

    @Override
    public String exportar() {
        return "AUDIO," + getTitulo() + "," + getGenero() + "," + getAno() + "," + getEdicion() + "," + getTipo();
    }

}
