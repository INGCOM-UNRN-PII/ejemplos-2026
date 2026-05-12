package ar.unrn.refactoring.generalization;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde varias clases parecidas piden extraer una generalizacion que capture lo comun.
 */
abstract class Vehiculo {
    /** Marca del vehículo. */
    protected String marca;
}

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde varias clases parecidas piden extraer una generalizacion que capture lo comun.
 */
class Auto extends Vehiculo {
    /**
     * Imprime la marca del auto.
     * MÉTODO A SUBIR: Es idéntico en la clase Moto.
     */
    public void imprimirMarca() {
        System.out.println("La marca es: " + marca);
    }
}

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde varias clases parecidas piden extraer una generalizacion que capture lo comun.
 */
class Moto extends Vehiculo {
    /**
     * Imprime la marca de la moto.
     * MÉTODO A SUBIR: Es idéntico en la clase Auto.
     */
    public void imprimirMarca() {
        System.out.println("La marca es: " + marca);
    }
}
