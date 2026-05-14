package ar.unrn.refactoring.patrones_diseno.avanzado.creacionales.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde los escenarios se duplican copiando colecciones y estado a mano.
 */
public class RegistroEscenarios {
    public EscenarioSimulacion duplicar(EscenarioSimulacion base) {
        EscenarioSimulacion copia = new EscenarioSimulacion();
        copia.nombre = base.nombre;
        copia.reglas = new ArrayList<>(base.reglas);
        copia.servicios = new ArrayList<>(base.servicios);
        return copia;
    }
}

class EscenarioSimulacion {
    String nombre = "";
    List<String> reglas = new ArrayList<>();
    List<String> servicios = new ArrayList<>();
}
