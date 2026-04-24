package ar.unrn.generados.parciales;

import java.util.Arrays;

/**
 * Aplicación principal para demostrar el funcionamiento de la clase Telemetria.
 */
public class TelemetriaApp {

    public static void main(String[] args) {
        System.out.println("--- Procesamiento de Telemetría Resiliente ---");

        // Caso 1: Datos normales y asimetría de tamaño
        String[] lecturas1 = {"100", "200", "300"};
        String[] factores1 = {"2", "10"};
        System.out.println("\nCaso 1: Asimetría de datos");
        procesarYMostrar(lecturas1, factores1, 3);

        // Caso 2: Anomalías numéricas y división por cero
        String[] lecturas2 = {"100", "abc", "300", "400"};
        String[] factores2 = {"5", "10", "0", "4"};
        System.out.println("\nCaso 2: Errores de formato y división por cero");
        procesarYMostrar(lecturas2, factores2, 4);

        // Caso 3: Valores nulos y desbordamiento (capacidad mayor que los arreglos)
        String[] lecturas3 = {"500", null};
        String[] factores3 = {"10", "5"};
        System.out.println("\nCaso 3: Valores nulos y desbordamiento de índice");
        procesarYMostrar(lecturas3, factores3, 4);
    }

    /**
     * Método para ejecutar la normalización e imprimir los resultados.
     */
    private static void procesarYMostrar(String[] lecturas, String[] factores, int capacidad) {
        System.out.println("Lecturas: " + Arrays.toString(lecturas));
        System.out.println("Factores: " + Arrays.toString(factores));
        System.out.println("Capacidad esperada: " + capacidad);
        
        String[] resultado = Telemetria.normalizarTelemetria(lecturas, factores, capacidad);
        
        System.out.println("Resultado normalizado: " + Arrays.toString(resultado));
        System.out.println("----------------------------------------------");
    }
}
