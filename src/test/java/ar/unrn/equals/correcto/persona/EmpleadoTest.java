package ar.unrn.equals.correcto.persona;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    @Test
    @DisplayName("Verifica el contrato de equals y hashCode en Empleado usando EqualsVerifier")
    void testEqualsAndHashCode() {
        // Utilizamos EqualsVerifier para evaluar la implementación exhaustiva del contrato.
        // Dado que Empleado redefine equals() y hereda de Persona (que también lo define),
        // utilizamos withRedefinedSuperclass() si la redefinición es intencional.
        EqualsVerifier.forClass(Empleado.class)
                // Se suprime la advertencia de mutabilidad si los campos heredados
                // no son finales estrictos, aunque deberían serlo.
                .suppress(Warning.NONFINAL_FIELDS)
                .withRedefinedSuperclass()
                .verify();
    }
}
