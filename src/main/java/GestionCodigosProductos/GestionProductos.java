package GestionCodigosProductos;

import java.util.Scanner;

public class GestionProductos {
    public static void main(String[] args) {
        System.out.println("Gestión de productos");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la descripción del producto:");
        String descripcionProducto = sc.nextLine();

        System.out.println("Introduce la categoría del producto:");
        String categoria = sc.nextLine();

        ClaseCodigoProducto ccp = new ClaseCodigoProducto();
        String codigo = ccp.GeneraCodigo(descripcionProducto, categoria);
        ccp.productos.add(codigo);

        System.out.println("El código del producto es: " + codigo);


    }
}