package ar.unrn.herencia.superconstructor;

public class EjemploSuper {
    public static void main(String[] args) {
        System.out.println("--- Demostración de super() ---");
        Smartphone miCelular = new Modelo("Samsung", "Galaxy S23", "SGH-2933F");
        miCelular.encender();
        miCelular.apagar();

    }
}
