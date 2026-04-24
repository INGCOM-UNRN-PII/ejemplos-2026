package ar.unrn.equals.contraejemplos;

import java.util.Objects;

/**
 * Contraejemplo 1: Sobrecargar equals en lugar de sobreescribirlo.
 */
public class SobrecargaEquals {
    private String valor;

    public SobrecargaEquals(String valor) {
        this.valor = valor;
    }

    /**
     * ¡MAL! Esto es una SOBRECARGA, no una SOBREESCRITURA (Override).
     * El método correcto a sobreescribir recibe un 'Object' y usa la anotación @Override.
     */
    public boolean equals(SobrecargaEquals otro) {
        if (this == otro) {
            return true;
        }
        if (otro == null) {
            return false;
        }
        return Objects.equals(valor, otro.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    public String getValor() {
        return valor;
    }
}
