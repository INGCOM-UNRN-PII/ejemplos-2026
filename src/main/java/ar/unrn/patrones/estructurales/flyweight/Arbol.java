package ar.unrn.patrones.estructurales.flyweight;

/**
 * Representa el contexto del Flyweight y combina el estado compartido del tipo con la posicion particular de cada arbol en el bosque.
 * El paquete modela Flyweight para compartir estado intrinseco y evitar repetir datos pesados en cada objeto del bosque.
 */
public class Arbol {
    private final int x;
    private final int y;
    private final TipoArbol tipo;

    public Arbol(int x, int y, TipoArbol tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("El tipo de arbol no puede ser nulo");
        }
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void dibujar() {
        tipo.dibujar(x, y);
    }
}
