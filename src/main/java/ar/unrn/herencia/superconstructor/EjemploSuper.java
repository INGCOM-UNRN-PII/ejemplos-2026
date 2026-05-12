package ar.unrn.herencia.superconstructor;

/**
 * Ejecuta el ejemplo de constructores heredados y hace visible el orden en que padre e hijo completan su inicializacion.
 * El paquete explica el uso de super en constructores para inicializar primero el estado heredado antes de completar la subclase.
 */
public class EjemploSuper {
    public static void main(String[] args) {
        System.out.println("--- Demostración de super() ---");
        Smartphone miCelular = new Modelo("Samsung", "Galaxy S23", "SGH-2933F");
        miCelular.encender();
        miCelular.apagar();

    }
}
