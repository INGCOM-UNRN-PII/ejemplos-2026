package ar.unrn.patrones.estructurales.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Mantiene y reutiliza flyweights para que los datos intrinsecos del arbol se compartan en lugar de repetirse en cada instancia visible.
 * El paquete modela Flyweight para compartir estado intrinseco y evitar repetir datos pesados en cada objeto del bosque.
 */
public class ArbolFactory {
    private static final Map<String, TipoArbol> TIPOS_DE_ARBOLES = new HashMap<>();

    public static TipoArbol getTipoArbol(String nombre, String color, String textura) {
        String clave = nombre + "|" + color + "|" + textura;
        TipoArbol tipo = TIPOS_DE_ARBOLES.get(clave);
        if (tipo == null) {
            System.out.println(">>> Creando nuevo TipoArbol pesado: " + nombre);
            tipo = new TipoArbol(nombre, color, textura);
            TIPOS_DE_ARBOLES.put(clave, tipo);
        }
        return tipo;
    }
}
