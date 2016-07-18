package biblioteca.objetos;

/**
 * Created by German Jongewaard de Boer  
 */

import biblioteca.constantes.TipoDisco;

public abstract class DiscoCompacto extends Item {

    private TipoDisco tipo;
    private String genero;
    private String ano;
    private String edicion;

    public DiscoCompacto(TipoDisco tipo, String genero, String ano, String edicion, String titulo) {
        super(titulo);
        this.tipo = tipo;
        this.genero = genero;
        this.ano = ano;
        this.edicion = edicion;
    }

    public void setTipo(TipoDisco tipo) {
        this.tipo = tipo;
    }

    public String getTipoDisco() {
        switch (tipo) {
            case DVD:
                return "DVD";
            case CD:
                return "CD";
            default:
                return "Unknow";
        }
    }

    public String toString() {
        return " Nombre = " + super.getTitulo() + "\n Género = " + genero + "\n Año = " + ano + "\n Edición = " + edicion + "\n Tipo Disco = " + getTipoDisco();
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public TipoDisco getTipo() {
        return tipo;
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
