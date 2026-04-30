package ar.unrn.refactoring.generalization;

/**
 * Clase base para vehículos.
 */
abstract class Vehiculo {
    /** Marca del vehículo. */
    protected String marca;
}

/**
 * Subclase que representa un automóvil.
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
 * Subclase que representa una motocicleta.
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
