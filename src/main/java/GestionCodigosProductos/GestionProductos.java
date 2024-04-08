package GestionCodigosProductos;

import java.util.Scanner;

public class GestionProductos {
    public static void main(String[] args) {
        System.out.println("    --Gestión de productos--\n");
        String respuesta;
        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce la descripción del producto:");
            String descripcionProducto = sc.nextLine();

            System.out.println("Introduce la categoría del producto:");
            String categoria = sc.nextLine();

            ClaseCodigoProducto ccp = new ClaseCodigoProducto();
            String codigo = ccp.GeneraCodigo(descripcionProducto, categoria);
            ccp.productos.add(codigo);

            System.out.println("El código del producto es: " + codigo);

            System.out.println("¿Quieres introducir otro producto? (s/n)");
            respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("n")){
                break;
            }


            System.out.println("Lista de Codigos de productos generados: ");
            for (String producto : ccp.productos){
                System.out.println(producto);
            }


        } while (respuesta.equalsIgnoreCase("s"));


    }
}