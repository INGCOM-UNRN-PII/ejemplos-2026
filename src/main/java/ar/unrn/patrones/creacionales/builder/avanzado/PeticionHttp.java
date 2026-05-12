package ar.unrn.patrones.creacionales.builder.avanzado;

import java.util.HashMap;
import java.util.Map;

/**
 * Representa el objeto complejo que el builder arma gradualmente y entrega al cliente una vez que la configuracion quedo consolidada.
 * El paquete usa Builder para construir peticiones HTTP complejas paso a paso, distinguiendo obligatorios de opcionales.
 */
public class PeticionHttp {
    private final String url;
    private final String metodo;
    private final Map<String, String> cabeceras;
    private final String cuerpo;

    private PeticionHttp(Builder builder) {
        this.url = builder.url;
        this.metodo = builder.metodo;
        this.cabeceras = builder.cabeceras;
        this.cuerpo = builder.cuerpo;
    }

    /**
     * Construye el objeto contenedor paso a paso y concentra las decisiones opcionales para que la instancia final nazca en un estado valido.
     * El paquete usa Builder para construir peticiones HTTP complejas paso a paso, distinguiendo obligatorios de opcionales.
     */
    public static class Builder {
        private String url;
        private String metodo = "GET";
        private Map<String, String> cabeceras = new HashMap<>();
        private String cuerpo = "";

        /**
         * @param url la dirección @return this
         */
        public Builder paraUrl(String url) {
            this.url = url;
            return this;
        }

        /**
         * @return this
         */
        public Builder comoPost() {
            this.metodo = "POST";
            return this;
        }

        /**
         * @param clave header @param valor header @return this
         */
        public Builder conCabecera(String clave, String valor) {
            this.cabeceras.put(clave, valor);
            return this;
        }

        /**
         * @param cuerpo body @return this
         */
        public Builder conCuerpo(String cuerpo) {
            this.cuerpo = cuerpo;
            return this;
        }

        /**
         * @return la peticion configurada
         */
        public PeticionHttp construir() {
            if (url == null) {
                throw new IllegalStateException("URL es obligatoria");
            }
            return new PeticionHttp(this);
        }
    }

    /**
     * Ejecuta la petición simulada.
     */
    public void enviar() {
        System.out.println("Enviando " + metodo + " a " + url + " con " + cabeceras.size() + " headers.");
    }
}
