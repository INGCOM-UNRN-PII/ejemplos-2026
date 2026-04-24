//LOCATION:ar/unrn

package ar.unrn.parciales;

import ar.unrn.generados.parciales.Telemetria;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BaselineTelemetriaTest {

    @Test
    @DisplayName("Ejecución Óptima: Datos íntegros y simétricos sin fallos")
    void testProcesamientoExitoso() {
        // Arrange
        String[] lecturas = {"100", "50", "20"};
        String[] factores = {"2", "5", "4"};
        int capacidad = 3;
        String[] esperado = {"50", "10", "5"};

        // Act
        String[] resultado = Telemetria.normalizarTelemetria(lecturas, factores, capacidad);

        // Assert
        assertNotNull(resultado, "El arreglo de retorno no debe ser nulo");
        assertEquals(capacidad, resultado.length, "La longitud del arreglo debe coincidir con la capacidad solicitada");
        assertArrayEquals(esperado, resultado, "Los cálculos aritméticos y el casteo a String deben ser exactos");
    }

    @Test
    @DisplayName("Vulnerabilidad de Nulls: Elementos nulos en ambos arreglos (NullPointerException)")
    void testVulnerabilidadNulls() {
        // Arrange
        String[] lecturas = {"100", null, "300"};
        String[] factores = {"2", "5", null};
        int capacidad = 3;
        String[] esperado = {"50", "ERR_NULO", "ERR_NULO"};

        // Act
        String[] resultado = Telemetria.normalizarTelemetria(lecturas, factores, capacidad);

        // Assert
        assertArrayEquals(esperado, resultado, "Debe atrapar NullPointerException y persistir ERR_NULO");
    }

    @Test
    @DisplayName("Asimetría Agresiva: Desbordamiento de estructura (ArrayIndexOutOfBoundsException)")
    void testAsimetriaEstructuras() {
        // Arrange
        String[] lecturas = {"100"};
        String[] factores = {"2", "4", "5", "8"};
        int capacidad = 5;
        String[] esperado = {"50", "ERR_INDICE", "ERR_INDICE", "ERR_INDICE", "ERR_INDICE"};

        // Act
        String[] resultado = Telemetria.normalizarTelemetria(lecturas, factores, capacidad);

        // Assert
        assertEquals(capacidad, resultado.length, "El tamaño del arreglo debe ser igual a la capacidad (5)");
        assertArrayEquals(esperado, resultado, "Debe manejar la falta de índices en ambos arreglos persistiendo ERR_INDICE");
    }

    @Test
    @DisplayName("Corrupción de Tipado: Valores no numéricos y malformados (NumberFormatException)")
    void testCorrupcionTipado() {
        // Arrange
        String[] lecturas = {"100", "0xFF", "300", " ", ""};
        String[] factores = {"2", "cinco", "3", "2", "2"};
        int capacidad = 5;
        String[] esperado = {"50", "ERR_FORMATO", "100", "ERR_FORMATO", "ERR_FORMATO"};

        // Act
        String[] resultado = Telemetria.normalizarTelemetria(lecturas, factores, capacidad);

        // Assert
        assertArrayEquals(esperado, resultado, "Debe atrapar NumberFormatException ante strings no parseables a int");
    }

    @Test
    @DisplayName("Singularidad Matemática: División por cero (ArithmeticException)")
    void testSingularidadMatematica() {
        // Arrange
        String[] lecturas = {"100", "50", "30"};
        String[] factores = {"2", "0", "3"};
        int capacidad = 3;
        String[] esperado = {"50", "ERR_DIV_CERO", "10"};

        // Act
        String[] resultado = Telemetria.normalizarTelemetria(lecturas, factores, capacidad);

        // Assert
        assertArrayEquals(esperado, resultado, "Debe atrapar ArithmeticException y continuar el procesamiento");
    }

    @Test
    @DisplayName("Límite de Capacidad Truncada: Arreglos mayores a la capacidad solicitada")
    void testCapacidadMenorALongitud() {
        // Arrange
        String[] lecturas = {"10", "20", "30", "40"};
        String[] factores = {"1", "2", "3", "4"};
        int capacidad = 2; // Menor que la longitud de los arreglos
        String[] esperado = {"10", "10"};

        // Act
        String[] resultado = Telemetria.normalizarTelemetria(lecturas, factores, capacidad);

        // Assert
        assertEquals(capacidad, resultado.length, "El bucle debe abortar al alcanzar la capacidad límite");
        assertArrayEquals(esperado, resultado);
    }

    @Test
    @DisplayName("Test de Integración: Resiliencia extrema combinando todas las anomalías")
    void testIntegracionResilienciaTotal() {
        // Arrange
        String[] lecturas = {"100", "A", null, "50", "10"};
        String[] factores = {"2", "5", "2", "0"}; // Un elemento menos que 'lecturas'
        int capacidad = 6; // Mayor a ambos arreglos
        String[] esperado = {
            "50",           // 100 / 2 (OK)
            "ERR_FORMATO",  // "A" / "5" (NumberFormatException)
            "ERR_NULO",     // null / "2" (NullPointerException)
            "ERR_DIV_CERO", // "50" / "0" (ArithmeticException)
            "ERR_INDICE",   // "10" / IndexError en factores (ArrayIndexOutOfBoundsException)
            "ERR_INDICE"    // IndexError en ambos
        };

        // Act
        String[] resultado = Telemetria.normalizarTelemetria(lecturas, factores, capacidad);

        // Assert
        assertArrayEquals(esperado, resultado, "El hilo de ejecución debe soportar y enrutar múltiples excepciones de distinto tipo consecutivamente");
    }
}
