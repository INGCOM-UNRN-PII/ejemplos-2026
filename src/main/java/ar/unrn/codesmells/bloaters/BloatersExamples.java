package ar.unrn.codesmells.bloaters;

import java.util.List;

/**
 * Bloaters: Long Method, Large Class, Primitive Obsession, Long Parameter List, Data Clumps.
 */
public class BloatersExamples {

    // 1. Long Parameter List & Data Clumps
    // inicio, fin, calle, ciudad, pais suelen viajar juntos (Data Clumps)
    public void registrarEvento(String nombre, int diaInicio, int mesInicio, int anioInicio, 
                                int diaFin, int mesFin, int anioFin, 
                                String calle, String ciudad, String pais) {
        // ...
    }

    // 2. Primitive Obsession
    // Usar String para todo en lugar de tipos específicos
    public void procesarUsuario(String email, String telefono, String cuit, String moneda, double monto) {
        // ...
    }
}

// 3. Large Class
class GestorTodoEnUno {
    // Demasiados campos y responsabilidades
    private List<String> usuarios;
    private List<String> productos;
    private List<String> facturas;
    private String configuracionDb;
    private String logPath;

    public void agregarUsuario() {}
    public void procesarFactura() {}
    public void conectarDb() {}
    public void imprimirReporte() {}
    public void enviarEmail() {}
}
