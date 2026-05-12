package ar.unrn.patrones.creacionales.builder.intermedio;

/**
 * Representa el objeto complejo que el builder arma gradualmente y entrega al cliente una vez que la configuracion quedo consolidada.
 * El paquete usa Builder para ensamblar perfiles con muchos datos opcionales sin multiplicar constructores.
 */
public class PerfilUsuario {
    private final String nombre;    // Requerido
    private final String apellido;  // Requerido
    private final int edad;         // Opcional
    private final String telefono;  // Opcional
    private final String direccion; // Opcional

    private PerfilUsuario(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.edad = builder.edad;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
    }

    /**
     * Construye el objeto contenedor paso a paso y concentra las decisiones opcionales para que la instancia final nazca en un estado valido.
     * El paquete usa Builder para ensamblar perfiles con muchos datos opcionales sin multiplicar constructores.
     */
    public static class Builder {
        private final String nombre;
        private final String apellido;
        private int edad = 0;
        private String telefono = "";
        private String direccion = "";

        /**
         * @param nombre requerido @param apellido requerido
         */
        public Builder(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        /**
         * @param edad opcional @return this
         */
        public Builder conEdad(int edad) {
            this.edad = edad;
            return this;
        }

        /**
         * @param tel opcional @return this
         */
        public Builder conTelefono(String tel) {
            this.telefono = tel;
            return this;
        }

        /**
         * @param dir opcional @return this
         */
        public Builder conDireccion(String dir) {
            this.direccion = dir;
            return this;
        }

        /**
         * @return instancia de PerfilUsuario
         */
        public PerfilUsuario construir() {
            return new PerfilUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " " + apellido + " (Edad: " + edad + ")";
    }
}
