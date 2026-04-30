package ar.unrn.codesmells.couplers;

/**
 * Couplers: Feature Envy, Inappropriate Intimacy, Incomplete Library Class, Message Chains, Middle Man.
 */
public class Couplers {
}

// 1. Feature Envy (Un método se interesa más por otra clase que por la propia)
class Cliente {
    public String obtenerDireccionCompleta() { return "Calle 123, Ciudad"; }
}

class Impresora {
    public void imprimirEtiqueta(Cliente c) {
        // En lugar de que Cliente sepa imprimirse, Impresora extrae todo
        System.out.println("Destino: " + c.obtenerDireccionCompleta());
    }
}

// 2. Message Chains (a.getB().getC()...)
class Motor { String getSerie() { return "SN123"; } }
class Auto { Motor getMotor() { return new Motor(); } }
class Persona {
    Auto getAuto() { return new Auto(); }
    void mostrarSerie() {
        // Cadena de mensajes: viola la Ley de Demeter
        System.out.println(this.getAuto().getMotor().getSerie());
    }
}

// 3. Middle Man (Una clase que solo delega)
class Trabajador { void trabajar() {} }
class Jefe {
    Trabajador t = new Trabajador();
    public void trabajar() { t.trabajar(); } // Solo delega, no agrega valor
}

// 4. Inappropriate Intimacy
class ClaseA {
    public int secretoInterno = 42;
}
class ClaseB {
    void chusmear(ClaseA a) {
        // Acceso directo a campos que deberían ser privados
        int x = a.secretoInterno;
    }
}
