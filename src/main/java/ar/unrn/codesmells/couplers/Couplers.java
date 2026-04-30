package ar.unrn.codesmells.couplers;

/**
 * Clase que agrupa ejemplos de Code Smells de tipo "Couplers".
 */
public class Couplers {
}

/** Cliente del sistema. */
class Cliente {
    /** @return dirección formateada. */
    public String obtenerDireccionCompleta() { return "Calle 123, Ciudad"; }
}

/** Clase con "Feature Envy" hacia Cliente. */
class Impresora {
    /** @param c el cliente a imprimir. */
    public void imprimirEtiqueta(Cliente c) {
        System.out.println("Destino: " + c.obtenerDireccionCompleta());
    }
}

/** Componente de un auto. */
class Motor { 
    /** @return número de serie. */
    String getSerie() { return "SN123"; } 
}
/** Representa un automóvil. */
class Auto { 
    /** @return el motor del auto. */
    Motor getMotor() { return new Motor(); } 
}
/** Clase que viola la Ley de Demeter (Message Chains). */
class Persona {
    /** @return el auto de la persona. */
    Auto getAuto() { return new Auto(); }
    /** Muestra la serie del motor navegando por la cadena. */
    void mostrarSerie() {
        System.out.println(this.getAuto().getMotor().getSerie());
    }
}

/** Clase que solo delega (Middle Man). */
class Trabajador { 
    /** Realiza el trabajo. */
    void trabajar() {} 
}
/** Intermediario sin valor agregado. */
class Jefe {
    private Trabajador t = new Trabajador();
    /** Delega el trabajo. */
    public void trabajar() { t.trabajar(); }
}

/** Clase con visibilidad excesiva (Inappropriate Intimacy). */
class ClaseA {
    /** Campo público que debería ser privado. */
    public int secretoInterno = 42;
}
/** Clase que accede a la intimidad de otra. */
class ClaseB {
    /** @param a instancia de ClaseA. */
    void chusmear(ClaseA a) {
        int x = a.secretoInterno;
    }
}
