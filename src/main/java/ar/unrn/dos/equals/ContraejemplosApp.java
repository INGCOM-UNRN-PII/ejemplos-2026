package ar.unrn.dos.equals;

import java.util.HashSet;
import java.util.Set;

/**
 * Aplicación de consola para demostrar los problemas de las malas implementaciones
 * de equals() y hashCode().
 * Lanza excepciones deliberadamente cuando detecta que el comportamiento es incorrecto
 * debido a una mala implementación subyacente.
 */
public class ContraejemplosApp {
    static void main() {
        
        System.out.println("--- DEMOSTRACIÓN DE MALAS PRÁCTICAS EN EQUALS Y HASHCODE ---\n");
        
        System.out.println("--- 1. Problema: Sobrecarga de equals en lugar de Sobreescritura ---");
        SobrecargaEquals obj1 = new SobrecargaEquals("texto");
        SobrecargaEquals obj2 = new SobrecargaEquals("texto");
        
        System.out.println("Llamando a obj1.equals(obj2)...");
        System.out.println("Resultado: " + obj1.equals(obj2) + " (Correcto, son el mismo texto)");
        
        Object obj2ComoObject = obj2; 

        System.out.println("\nLlamando a obj1.equals(obj2ComoObject)...");
        boolean resultadoSobrecarga = obj1.equals(obj2ComoObject);
        System.out.println("Resultado: " + resultadoSobrecarga);
        
        if (!resultadoSobrecarga) {
            System.err.println("¡FALLO DETECTADO! obj1 y obj2ComoObject deberían ser iguales, pero equals() retornó false.");
            System.err.println("Motivo: La sobrecarga 'equals(SobrecargaEquals)' no reemplaza a 'equals(Object)'.");
            throw new AssertionError("La igualdad falló debido a una sobrecarga incorrecta en lugar de sobreescritura.");
        }


        System.out.println("\n--- 2. Problema: Implementación defectuosa de hashCode() ---");
        Set<MalHashCode> conjunto = new HashSet<>();
        MalHashCode mal1 = new MalHashCode("ID-123");
        conjunto.add(mal1);
        
        MalHashCode mal2 = new MalHashCode("ID-123");
        
        System.out.println("Hemos creado dos objetos con el mismo ID: 'ID-123'");
        System.out.println("¿mal1.equals(mal2)?: " + mal1.equals(mal2));
        
        boolean loContiene = conjunto.contains(mal2);
        System.out.println("Agregamos mal1 a un HashSet. ¿El HashSet contiene a mal2?: " + loContiene);
        
        if (!loContiene) {
            System.err.println("¡FALLO DETECTADO! El conjunto DEBERÍA contener a mal2 porque lógicamente es igual a mal1.");
            System.err.println("Motivo: El hashCode devuelve valores aleatorios, el HashSet busca en el 'balde' equivocado.");
            System.err.println("Hash de mal1: " + mal1.hashCode());
            System.err.println("Hash de mal2: " + mal2.hashCode());
            throw new AssertionError("Fallo en la colección debido a una implementación aleatoria e inconsistente de hashCode().");
        }


        System.out.println("\n--- 3. Problema: Implementar equals basado en hashCode() ---");
        IgualdadPorHash hash1 = new IgualdadPorHash("FB");
        IgualdadPorHash hash2 = new IgualdadPorHash("Ea");

        System.out.println("Objeto 1 con texto: '" + hash1.getTexto() + "' (hash: " + hash1.hashCode() + ")");
        System.out.println("Objeto 2 con texto: '" + hash2.getTexto() + "' (hash: " + hash2.hashCode() + ")");
        
        System.out.println("Llamando a hash1.equals(hash2)...");
        boolean igualesPorColision = hash1.equals(hash2);
        System.out.println("Resultado: " + igualesPorColision);
        
        if (igualesPorColision) {
            System.err.println("¡FALLO DETECTADO! 'FB' y 'Ea' NO son el mismo texto, pero equals() retornó true.");
            System.err.println("Motivo: Ocurrió una colisión en el cálculo del hash, que hizo que ambos textos distintos arrojaran el mismo número.");
            throw new AssertionError("Falso positivo de igualdad (colisión) debido a que equals() se basó únicamente en hashCode().");
        }
    }
}
