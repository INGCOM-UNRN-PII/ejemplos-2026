package ar.unrn.dos.equals;

import java.util.HashSet;
import java.util.Set;

/**
 * Aplicación de consola para demostrar los problemas de las malas implementaciones
 * de equals() y hashCode().
 */
public class ContraejemplosApp {
    public static void main(String[] args) {
        System.out.println("--- 1. Problema: Sobrecarga de equals en lugar de Sobreescritura ---");
        SobrecargaEquals obj1 = new SobrecargaEquals("texto");
        SobrecargaEquals obj2 = new SobrecargaEquals("texto");
        
        // Como 'obj2' se asigna a una referencia de tipo genérico Object:
        Object obj2ComoObject = obj2; 

        // Aquí el compilador elige el método 'equals(SobrecargaEquals)' porque obj2 es de ese tipo explícito.
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2) + " (Correcto)");
        
        // ¡FALLA! Aquí el compilador NO llama a tu equals() sobrecargado, sino al equals(Object) original 
        // de la clase Object (que compara referencias de memoria) porque 'obj2ComoObject' es tipo Object.
        System.out.println("obj1.equals(obj2ComoObject): " + obj1.equals(obj2ComoObject) + " (Falso, ¡debería ser true!)");


        System.out.println("\n--- 2. Problema: Implementación defectuosa de hashCode() ---");
        Set<MalHashCode> conjunto = new HashSet<>();
        MalHashCode mal1 = new MalHashCode("ID-123");
        conjunto.add(mal1); // Se guarda en un 'balde' según su hashCode aleatorio
        
        MalHashCode mal2 = new MalHashCode("ID-123");
        
        // Lógicamente son iguales...
        System.out.println("mal1.equals(mal2): " + mal1.equals(mal2) + " (Son iguales lógicamente)");
        
        // ¡FALLA! El conjunto no lo encontrará porque mal2 tiene un hashCode distinto al que se guardó.
        System.out.println("¿El conjunto contiene a mal2?: " + conjunto.contains(mal2) + " (Falso, ¡debería encontrarlo!)");


        System.out.println("\n--- 3. Problema: Implementar equals basado en hashCode() ---");
        // "FB" y "Ea" producen exactamente el mismo hashCode estándar en String (valor numérico: 2236).
        IgualdadPorHash hash1 = new IgualdadPorHash("FB");
        IgualdadPorHash hash2 = new IgualdadPorHash("Ea");

        System.out.println("Texto 1: '" + hash1.getTexto() + "' (hash: " + hash1.hashCode() + ")");
        System.out.println("Texto 2: '" + hash2.getTexto() + "' (hash: " + hash2.hashCode() + ")");
        
        // ¡FALLA! Dirá que son iguales aunque sus textos internos son completamente diferentes, 
        // debido a que ocurrió una colisión en el cálculo del hash.
        System.out.println("hash1.equals(hash2): " + hash1.equals(hash2) + " (True, ¡falso positivo por colisión!)");
    }
}
