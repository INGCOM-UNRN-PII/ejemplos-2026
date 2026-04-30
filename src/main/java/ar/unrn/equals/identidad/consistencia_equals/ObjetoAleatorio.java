package ar.unrn.equals.identidad.consistencia_equals;

import java.util.Random;

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
