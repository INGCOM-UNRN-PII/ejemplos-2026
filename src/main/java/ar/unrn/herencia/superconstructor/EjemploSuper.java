package ar.unrn.herencia.superconstructor;
public class EjemploSuper {
    public static void main(String[] args) {
        System.out.println("--- Demostración de super() ---");
        Smartphone miCelular = new Smartphone("Samsung", "Galaxy S23");
        miCelular.encender();
    }
}
