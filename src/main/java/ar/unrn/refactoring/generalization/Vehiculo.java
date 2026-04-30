package ar.unrn.refactoring.generalization;

abstract class Vehiculo {
    protected String marca;
}

class Auto extends Vehiculo {
    // MÉTODO A SUBIR: Es idéntico en Moto
    public void imprimirMarca() {
        System.out.println("La marca es: " + marca);
    }
}

class Moto extends Vehiculo {
    public void imprimirMarca() {
        System.out.println("La marca es: " + marca);
    }
}
