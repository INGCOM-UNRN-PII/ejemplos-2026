package ar.unrn.codesmells.couplers;

/**
 * Representa una pieza del ejemplo de acoplamiento y deja ver cuanta informacion ajena necesita conocer para cumplir su trabajo.
 * El paquete concentra ejemplos de acoplamiento excesivo para hacer visible cuando una clase conoce demasiados detalles de las demas.
 */
public class Couplers {
}

/**
 * Representa una pieza del ejemplo de acoplamiento y deja ver cuanta informacion ajena necesita conocer para cumplir su trabajo.
 * El paquete concentra ejemplos de acoplamiento excesivo para hacer visible cuando una clase conoce demasiados detalles de las demas.
 */
class Cliente {
    /**
     * @return dirección formateada.
     */
    public String obtenerDireccionCompleta() {
        return "Calle 123, Ciudad";
    }
}

/**
 * Representa una pieza del ejemplo de acoplamiento y deja ver cuanta informacion ajena necesita conocer para cumplir su trabajo.
 * El paquete concentra ejemplos de acoplamiento excesivo para hacer visible cuando una clase conoce demasiados detalles de las demas.
 */
class Impresora {
    /**
     * @param c el cliente a imprimir.
     */
    public void imprimirEtiqueta(Cliente c) {
        System.out.println("Destino: " + c.obtenerDireccionCompleta());
    }
}

/**
 * Representa una pieza del ejemplo de acoplamiento y deja ver cuanta informacion ajena necesita conocer para cumplir su trabajo.
 * El paquete concentra ejemplos de acoplamiento excesivo para hacer visible cuando una clase conoce demasiados detalles de las demas.
 */
class Motor {
    /**
     * @return número de serie.
     */
    String getSerie() {
        return "SN123";
    }
}

/**
 * Representa una pieza del ejemplo de acoplamiento y deja ver cuanta informacion ajena necesita conocer para cumplir su trabajo.
 * El paquete concentra ejemplos de acoplamiento excesivo para hacer visible cuando una clase conoce demasiados detalles de las demas.
 */
class Auto {
    /**
     * @return el motor del auto.
     */
    Motor getMotor() {
        return new Motor();
    }
}

/**
 * Representa una pieza del ejemplo de acoplamiento y deja ver cuanta informacion ajena necesita conocer para cumplir su trabajo.
 * El paquete concentra ejemplos de acoplamiento excesivo para hacer visible cuando una clase conoce demasiados detalles de las demas.
 */
class Persona {
    /**
     * @return el auto de la persona.
     */
    Auto getAuto() {
        return new Auto();
    }

    /**
     * Muestra la serie del motor navegando por la cadena.
     */
    void mostrarSerie() {
        System.out.println(this.getAuto().getMotor().getSerie());
    }
}

/**
 * Representa una pieza del ejemplo de acoplamiento y deja ver cuanta informacion ajena necesita conocer para cumplir su trabajo.
 * El paquete concentra ejemplos de acoplamiento excesivo para hacer visible cuando una clase conoce demasiados detalles de las demas.
 */
class Trabajador {
    /**
     * Realiza el trabajo.
     */
    void trabajar() {
    }
}

/**
 * Representa una pieza del ejemplo de acoplamiento y deja ver cuanta informacion ajena necesita conocer para cumplir su trabajo.
 * El paquete concentra ejemplos de acoplamiento excesivo para hacer visible cuando una clase conoce demasiados detalles de las demas.
 */
class Jefe {
    private Trabajador t = new Trabajador();

    /**
     * Delega el trabajo.
     */
    public void trabajar() {
        t.trabajar();
    }
}

/**
 * Representa una pieza del ejemplo de acoplamiento y deja ver cuanta informacion ajena necesita conocer para cumplir su trabajo.
 * El paquete concentra ejemplos de acoplamiento excesivo para hacer visible cuando una clase conoce demasiados detalles de las demas.
 */
class ClaseA {
    /**
     * Campo público que debería ser privado.
     */
    public int secretoInterno = 42;
}

/**
 * Representa una pieza del ejemplo de acoplamiento y deja ver cuanta informacion ajena necesita conocer para cumplir su trabajo.
 * El paquete concentra ejemplos de acoplamiento excesivo para hacer visible cuando una clase conoce demasiados detalles de las demas.
 */
class ClaseB {
    /**
     * @param a instancia de ClaseA.
     */
    void chusmear(ClaseA a) {
        int x = a.secretoInterno;
    }
}
