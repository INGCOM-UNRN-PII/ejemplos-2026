package ar.unrn.smells.inseparabilidad;

/**
 * Ejemplo 1: Lógica de negocio atada a la interfaz (Swing/AWT).
 * No se puede reusar el cálculo de IVA en una App Web o CLI.
 */
class VentanaFactura {
    public void alHacerClick() {
        double monto = 100.0; // Obtener de un JTextField imaginario
        double iva = monto * 0.21; // Lógica de negocio insepable de la UI
        System.out.println("IVA calculado en la ventana: " + iva);
    }
}

/**
 * Ejemplo 2: Lógica de negocio mezclada con persistencia específica.
 */
class ValidadorUsuario {
    public boolean esValido(String nombre) {
        // La validación depende de una conexión directa a un archivo físico
        // No se puede testear ni reusar sin ese archivo.
        System.out.println("Abriendo archivo /etc/passwd para validar...");
        return nombre != null && !nombre.isEmpty();
    }
}
