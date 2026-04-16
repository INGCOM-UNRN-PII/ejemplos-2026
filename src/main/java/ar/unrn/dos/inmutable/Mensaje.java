package ar.unrn.dos;

import java.util.Objects;

/**
 * Clase que envuelve una cadena de texto (String).
 * Al ser String una clase inmutable, esta clase no sufre los problemas
 * de fugas de encapsulamiento ni requiere copias defensivas al recibir
 * o retornar el texto.
 */
public class Mensaje {

    private final String texto;

    /**
     * Construye una nueva instancia de Mensaje.
     * Al usar String, que es inmutable, no hace falta copiar el objeto.
     *
     * @param texto El texto inicial.
     */
    public Mensaje(String texto) {
        Objects.requireNonNull(texto, "El texto no puede ser nulo");
        this.texto = texto;
    }

    /**
     * Obtiene el texto. 
     * Retornar la referencia directa es seguro porque String es inmutable.
     *
     * @return El texto del mensaje.
     */
    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return "Mensaje: [" + texto + "]";
    }
}
