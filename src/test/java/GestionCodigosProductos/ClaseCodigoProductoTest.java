package GestionCodigosProductos;

import static org.junit.jupiter.api.Assertions.*;

class ClaseCodigoProductoTest {

    @org.junit.jupiter.api.Test
    void generaCodigo() {
        ClaseCodigoProducto ccp = new ClaseCodigoProducto();
        String codigo = ccp.GeneraCodigo("Pantalón", "Ropa");
        assertEquals("PA-RO-001", codigo);
    }

    @org.junit.jupiter.api.Test
    void generaCodigoDescripcionVacia() {
        ClaseCodigoProducto ccp = new ClaseCodigoProducto();
        String codigo = ccp.GeneraCodigo("", "Ropa");
        assertEquals("", codigo);
    }

    @org.junit.jupiter.api.Test
    void generaCodigoCategoriaVacia() {
        ClaseCodigoProducto ccp = new ClaseCodigoProducto();
        String codigo = ccp.GeneraCodigo("Pantalón", "");
        assertEquals("", codigo);
    }

    @org.junit.jupiter.api.Test
    void generaCodigoDescripcionCategoriaVacia() {
        ClaseCodigoProducto ccp = new ClaseCodigoProducto();
        String codigo = ccp.GeneraCodigo("", "");
        assertEquals("", codigo);
    }

    @org.junit.jupiter.api.Test
    void generaCodigoDescripcionNull() {
        ClaseCodigoProducto ccp = new ClaseCodigoProducto();
        String codigo = ccp.GeneraCodigo(null, "Ropa");
        assertEquals("", codigo);
    }

    @org.junit.jupiter.api.Test
    void generaCodigoCategoriaNull() {
        ClaseCodigoProducto ccp = new ClaseCodigoProducto();
        String codigo = ccp.GeneraCodigo("Pantalón", null);
        assertEquals("", codigo);
    }

    @org.junit.jupiter.api.Test
    void generaCodigoDescripcionCategoriaNull() {
        ClaseCodigoProducto ccp = new ClaseCodigoProducto();
        String codigo = ccp.GeneraCodigo(null, null);
        assertEquals("", codigo);
    }

}