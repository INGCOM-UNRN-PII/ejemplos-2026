package ar.unrn.patrones.estructurales.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Agrupa los arboles del escenario y ofrece un cliente natural para observar el ahorro que produce compartir flyweights.
 * El paquete modela Flyweight para compartir estado intrinseco y evitar repetir datos pesados en cada objeto del bosque.
 */
public class Bosque {
    private final List<Arbol> arboles = new ArrayList<>();

    public void plantarArbol(int x, int y, String nombre, String color, String textura) {
        TipoArbol tipo = ArbolFactory.getTipoArbol(nombre, color, textura);
        arboles.add(new Arbol(x, y, tipo));
    }

    public void dibujar() {
        for (Arbol arbol : arboles) {
            arbol.dibujar();
        }
    }
}
