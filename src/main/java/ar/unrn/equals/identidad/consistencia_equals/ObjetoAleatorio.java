package ar.unrn.equals.identidad.consistencia_equals;

import java.util.Random;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete expone por que equals debe ser consistente entre invocaciones sucesivas mientras los objetos no cambian de estado relevante.
 */
public class ObjetoAleatorio {
    private final Random rand = new Random();

    @Override
    public boolean equals(Object obj) {
        return rand.nextBoolean();
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
