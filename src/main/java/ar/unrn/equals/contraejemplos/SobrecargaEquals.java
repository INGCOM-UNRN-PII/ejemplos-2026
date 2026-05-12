package ar.unrn.equals.contraejemplos;

import java.util.Objects;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete reúne contraejemplos clasicos del protocolo equals/hashCode para que el error se vea de forma concreta antes de discutir la solucion.
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
