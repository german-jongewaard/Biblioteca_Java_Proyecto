package biblioteca.persistencia;

/**
 * Created by German Jongewaard de Boer 
 */

import biblioteca.listas.Categoria;
import biblioteca.listas.ListaCategoria;
import biblioteca.listas.ListaItem;
import java.io.Serializable;

public class Datos implements Serializable {

    private ListaCategoria mCategorias;
    private ListaItem mItems;

    protected Datos() {
        mCategorias = new ListaCategoria();
        Categoria categoria = new Categoria("Default");
        mCategorias.add(categoria);
        mItems = new ListaItem();
    }

    public ListaCategoria getCategorias() {
        return mCategorias;
    }

    public ListaItem getItems() {
        return mItems;
    }
}
