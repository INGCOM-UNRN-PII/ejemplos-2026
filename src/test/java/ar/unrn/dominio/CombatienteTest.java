package ar.unrn.dominio;

import ar.unrn.dominio.combate.Arma;
import ar.unrn.dominio.combate.Combatiente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CombatienteTest {

    @Test
    @DisplayName("Un combatiente debe ser derrotado tras recibir suficiente daño")
    void testCombateHastaDerrota() {
        // Configuramos el escenario
        Arma espadaFuerte = new Arma(10, 5);
        Combatiente heroe = new Combatiente("Hércules", 15, espadaFuerte);
        Combatiente villano = new Combatiente("Hidra", 25, new Arma(2, 100));

        // Primer ataque: Hidra 25 -> 15
        heroe.atacar(villano);
        assertFalse(villano.estaFueraDeCombate(), "La Hidra aún debería tener 15 de vida");

        // Segundo ataque: Hidra 15 -> 5
        heroe.atacar(villano);
        assertFalse(villano.estaFueraDeCombate(), "La Hidra aún debería tener 5 de vida");

        // Tercer ataque: Hidra 5 -> 0 (Derrota)
        heroe.atacar(villano);
        assertTrue(villano.estaFueraDeCombate(), "La Hidra debería estar fuera de combate");
    }

    @Test
    @DisplayName("Un arma sin usos no debe infligir daño")
    void testArmaSinMunicion() {
        Arma dagaGastada = new Arma(10, 1);
        Combatiente heroe = new Combatiente("Hércules", 100, dagaGastada);
        Combatiente maniqui = new Combatiente("Práctica", 15, new Arma(0, 0));

        // Primer ataque usa la única carga
        heroe.atacar(maniqui);
        
        // Segundo ataque no debería hacer nada (arma sin usos)
        heroe.atacar(maniqui);
        
        assertFalse(maniqui.estaFueraDeCombate(), "El maniquí no debería haber recibido el segundo golpe");
    }
}
