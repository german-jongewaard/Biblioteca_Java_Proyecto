package biblioteca.listas;

/**
 * Created by German Jongewaard de Boer  
 */

import java.io.Serializable;
import java.util.ArrayList;

public class Categoria extends ListaItem implements Serializable {

    private String nombre;
   
    public Categoria(String nombre){//SETTER
        this.nombre=nombre;
    }
    public String toString(){//GETTER
        return nombre;
    }
    @Override
    public boolean equals(Object o) {//GETTER
        if(o instanceof String){
            return nombre.toLowerCase().equals(((String) o).toLowerCase());
        }else if(o instanceof Categoria){
            return nombre.toLowerCase().equals(((Categoria) o).nombre.toLowerCase());
        }else
            return super.equals(o);
    }
    public String exportar(){//GETTER
        return "CATEGORIA,"+nombre;
    }
}