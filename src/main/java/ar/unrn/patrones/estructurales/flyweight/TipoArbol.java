package ar.unrn.patrones.estructurales.flyweight;

/**
 * Encapsula el estado intrinseco que puede compartirse entre muchos arboles, como especie o apariencia comun.
 * El paquete modela Flyweight para compartir estado intrinseco y evitar repetir datos pesados en cada objeto del bosque.
 */
public class TipoArbol {
    private final String nombre;
    private final String color;
    private final String textura;

    public TipoArbol(String nombre, String color, String textura) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del arbol no puede ser nulo ni vacio");
        }
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("El color del arbol no puede ser nulo ni vacio");
        }
        if (textura == null || textura.isBlank()) {
            throw new IllegalArgumentException("La textura del arbol no puede ser nula ni vacia");
        }
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
    }

    public void dibujar(int x, int y) {
        System.out.println("Dibujando árbol [" + nombre + "] en (" + x + ", " + y + ") con color "
                + color + " y textura: " + textura);
    }
}
