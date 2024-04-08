package GestionCodigosProductos;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class ClaseCodigoProducto {

    public static ArrayList<String> productos = new ArrayList<>();
    public static int contadorArticulos = 1; //Inicializamos el contador de articulos a 1

    public String GeneraCodigo(String descripcionProducto, String categoria){
        if (descripcionProducto == null || descripcionProducto.isEmpty() || categoria == null || categoria.isEmpty()){
            throw new IllegalArgumentException("La descripción del producto y la categoría no pueden estar vacías");
        }

        String codigoArticulo = String.format("%03d", contadorArticulos);
        String codigo = descripcionProducto.trim().substring(0,2).toUpperCase() + "-" + categoria.trim().substring(0,2).toUpperCase() + "-" + codigoArticulo;
        contadorArticulos++;

        return codigo;
    }
}
