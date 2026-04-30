package ar.unrn.equals.correcto.persona;

import java.util.HashSet;
import java.util.Set;

/**
 * Aplicación de consola para demostrar el uso correcto de equals() y hashCode()
 * utilizando la clase Persona.
 */
public class PersonaApp {

    @SuppressWarnings({"SelfEquals", "EqualsNull", "NullAway"})
    static void main() {
        System.out.println("--- Demostración de equals() y hashCode() CORRECTOS ---");

        Persona p1 = new Persona("Juan", 30);
        Persona p2 = new Persona("Juan", 30);
        Persona p3 = new Persona("Ana", 25);

        System.out.println("Persona 1: " + p1);
        System.out.println("Persona 2: " + p2);
        System.out.println("Persona 3: " + p3);

        System.out.println("\n--- 1. Pruebas de igualdad (equals) ---");
        System.out.println("¿p1 es igual a p1? (Reflexividad): " + p1.equals(p1));
        System.out.println("¿p1 es igual a p2? (Igualdad lógica): " + p1.equals(p2));
        System.out.println("¿p2 es igual a p1? (Simetría): " + p2.equals(p1));
        System.out.println("¿p1 es igual a p3? (Diferentes): " + p1.equals(p3));
        System.out.println("¿p1 es igual a null?: " + p1.equals(null));

        System.out.println("\n--- 2. Pruebas de colecciones (hashCode) ---");
        Set<Persona> grupo = new HashSet<>();

        System.out.println("Agregando p1 al HashSet...");
        grupo.add(p1);

        System.out.println("¿El HashSet contiene a p1?: " + grupo.contains(p1));

        // p2 es una instancia distinta en memoria, pero lógicamente igual a p1
        System.out.println("¿El HashSet contiene a p2? (Distinta instancia, mismos datos): " + grupo.contains(p2) + " (¡Correcto! Lo encuentra porque hashCode y equals están bien implementados)");

        System.out.println("Agregando p2 al HashSet...");
        boolean agregado = grupo.add(p2);
        System.out.println("¿Se agregó p2? (HashSet no permite duplicados): " + agregado + " (No se agregó, reconoce que ya existe)");

        System.out.println("Tamaño del HashSet: " + grupo.size() + " (Debería ser 1)");
    }
}
