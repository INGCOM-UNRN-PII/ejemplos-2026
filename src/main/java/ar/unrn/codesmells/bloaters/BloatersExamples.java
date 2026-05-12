package ar.unrn.codesmells.bloaters;

import java.util.List;

/**
 * Representa una pieza del ejemplo que crecio mas de lo debido y ayuda a detectar por que el exceso de tamano vuelve pesado cualquier cambio.
 * El paquete reúne ejemplos de bloaters para mostrar como clases, metodos o listas de datos demasiado grandes vuelven torpe cualquier cambio.
 */
public class BloatersExamples {

    /**
     * Registra un evento con una lista excesiva de parámetros (Data Clump).
     * 
     * @param nombre     nombre del evento.
     * @param diaInicio  día de inicio.
     * @param mesInicio  mes de inicio.
     * @param anioInicio año de inicio.
     * @param diaFin     día de fin.
     * @param mesFin     mes de fin.
     * @param anioFin    año de fin.
     * @param calle      calle de ubicación.
     * @param ciudad     ciudad de ubicación.
     * @param pais       país de ubicación.
     */
    public void registrarEvento(String nombre, int diaInicio, int mesInicio, int anioInicio, 
                                int diaFin, int mesFin, int anioFin, 
                                String calle, String ciudad, String pais) {
        // ...
    }

    /**
     * Procesa datos de un usuario utilizando tipos primitivos (Primitive Obsession).
     * 
     * @param email    correo electrónico.
     * @param telefono número de teléfono.
     * @param cuit     identificación fiscal.
     * @param moneda   código de moneda.
     * @param monto    importe.
     */
    public void procesarUsuario(String email, String telefono, String cuit, String moneda, double monto) {
        // ...
    }
}

/**
 * Representa una pieza del ejemplo que crecio mas de lo debido y ayuda a detectar por que el exceso de tamano vuelve pesado cualquier cambio.
 * El paquete reúne ejemplos de bloaters para mostrar como clases, metodos o listas de datos demasiado grandes vuelven torpe cualquier cambio.
 */
class GestorTodoEnUno {
    private List<String> usuarios;
    private List<String> productos;
    private List<String> facturas;
    private String configuracionDb;
    private String logPath;

    /** Agrega un nuevo usuario al sistema. */
    public void agregarUsuario() {}
    /** Realiza el procesamiento de una factura. */
    public void procesarFactura() {}
    /** Establece la conexión con la base de datos. */
    public void conectarDb() {}
    /** Genera y envía un reporte por consola. */
    public void imprimirReporte() {}
    /** Envía una notificación por correo electrónico. */
    public void enviarEmail() {}
}
