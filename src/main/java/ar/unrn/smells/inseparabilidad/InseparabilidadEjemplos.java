package ar.unrn.smells.inseparabilidad;

/**
 * Ejemplo 1: Lógica de negocio atada a la interfaz de usuario.
 * No se puede reusar el cálculo de IVA sin la ventana.
 */
class VentanaFactura {
    /**
     * Simula la acción de un usuario al hacer clic en un botón.
     * Contiene lógica de negocio mezclada con UI.
     */
    public void alHacerClick() {
        double monto = 100.0; // Obtener de un JTextField imaginario
        double iva = monto * 0.21; // Lógica de negocio insepable de la UI
        System.out.println("IVA calculado en la ventana: " + iva);
    }
}

/**
 * Ejemplo 2: Lógica de negocio mezclada con persistencia física específica.
 */
class ValidadorUsuario {
    /**
     * Valida si un nombre de usuario es correcto consultando archivos del sistema.
     * 
     * @param nombre el nombre del usuario a validar.
     * @return verdadero si el nombre no es nulo ni vacío.
     */
    public boolean esValido(String nombre) {
        // La validación depende de una conexión directa a un archivo físico
        // No se puede testear ni reusar sin ese archivo.
        System.out.println("Abriendo archivo /etc/passwd para validar...");
        return nombre != null && !nombre.isEmpty();
    }
}
