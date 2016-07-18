package biblioteca.persistencia;

/**
 * Created by German Jongewaard de Boer 
 */

import biblioteca.constantes.TipoDisco;
import biblioteca.objetos.Libro;
import biblioteca.objetos.Audio;
import biblioteca.objetos.Dato;
import biblioteca.objetos.Revista;
import biblioteca.objetos.Pelicula;

import java.text.ParseException;

public class ItemBuilder {

    public static Libro getLibroFromString(String line) {
        String s[] = line.split(",");
        Libro l = new Libro(s[1], s[2], s[3]);
        return l;
    }

    public static Revista getRevistaFromString(String line) {
        Revista r = null;
        String s[] = line.split(",");
        r = new Revista(s[1], s[2], s[3], s[4]);
        return r;
    }

    public static Pelicula getPeliculaFromString(String line) {
        Pelicula p = null;
        String s[] = line.split(",");
        p = new Pelicula(TipoDisco.DVD, s[2], s[3], s[4], s[1]);
        return p;
    }

    public static Audio getAudioFromString(String line) {
        Audio a = null;
        String s[] = line.split(",");
        a = new Audio(TipoDisco.CD, s[2], s[3], s[4], s[1]);
        return a;
    }
    public static Dato getDatoFromString(String line) {
        Dato a = null;
        String s[] = line.split(",");
        a = new Dato(TipoDisco.DVD, s[2], s[3], s[4], s[1]);
        return a;
    }
}
