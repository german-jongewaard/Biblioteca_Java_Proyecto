package biblioteca.persistencia;

/**
 * Created by German Jongewaard de Boer 
 */

import biblioteca.listas.Categoria;

public class CategoriaBuilder {
    public static Categoria getCategoriaFromString(String categoria){
        Categoria cat=null;
        String str[] = categoria.split(",");
        if(str.length == 2)
            return new Categoria(str[1].trim());
        else
            return null;
    }
}
