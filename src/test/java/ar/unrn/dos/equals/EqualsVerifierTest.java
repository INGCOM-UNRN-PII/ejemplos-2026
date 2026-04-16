package ar.unrn.dos.equals;

import ar.unrn.dos.colisiones.ObjetoSimple;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EqualsVerifierTest {

    @Test
    @DisplayName("Persona debe cumplir con el contrato de equals y hashCode")
    public void testPersona() {
        EqualsVerifier.forClass(Persona.class)
                .suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS)
                .verify();
    }

    @Test
    @DisplayName("ObjetoSimple debe cumplir con el contrato de equals y hashCode")
    public void testObjetoSimple() {
        EqualsVerifier.forClass(ObjetoSimple.class)
                .suppress(Warning.STRICT_INHERITANCE)
                .verify();
    }

    @Test
    @DisplayName("IgualdadPorHash debe fallar (usa hashCode para equals)")
    public void testIgualdadPorHash() {
        // Esta clase usa hashCode() en equals() y tiene un hashCode() constante (1).
        // EqualsVerifier debería detectar que no cumple el contrato.
        assertThrows(AssertionError.class, () -> {
            EqualsVerifier.forClass(IgualdadPorHash.class)
                    .verify();
        }, "Se esperaba que EqualsVerifier fallara para IgualdadPorHash");
    }

    @Test
    @DisplayName("MalHashCode debe fallar (hashCode aleatorio)")
    public void testMalHashCode() {
        // Esta clase tiene un hashCode aleatorio, lo que viola la consistencia.
        assertThrows(AssertionError.class, () -> {
            EqualsVerifier.forClass(MalHashCode.class)
                    .verify();
        }, "Se esperaba que EqualsVerifier fallara para MalHashCode");
    }
}
