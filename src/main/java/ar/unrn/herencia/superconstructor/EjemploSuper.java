package ar.unrn.generados.herencia.superconstructor;

/**
 * Ejemplo que demuestra el uso de la palabra clave 'super'.
 * 
 * Se utiliza para:
 * 1. Invocar constructores de la superclase: super().
 * 2. Invocar métodos de la superclase: super.metodo().
 */
public class EjemploSuper {

    static class Dispositivo {
        private final String marca;
        private boolean encendido;

        public Dispositivo(String marca) {
            this.marca = marca;
            this.encendido = false;
            System.out.println("[Padre] Inicializando dispositivo marca: " + marca);
        }

        public void encender() {
            this.encendido = true;
            System.out.println("Dispositivo encendido.");
        }

        public String getMarca() { return marca; }
    }

    static class Smartphone extends Dispositivo {
        private final String modelo;

        public Smartphone(String marca, String modelo) {
            // 1. Llamada al constructor del padre.
            // Debe ser la PRIMERA línea del constructor del hijo.
            super(marca); 
            this.modelo = modelo;
            System.out.println("[Hijo] Inicializando Smartphone modelo: " + modelo);
        }

        @Override
        public void encender() {
            // 2. Llamada al método del padre.
            // Permite reusar la lógica base y agregar comportamiento extra.
            super.encender();
            System.out.println("Smartphone " + modelo + " mostrando logo de inicio...");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Demostración de super() ---");
        Smartphone miCelular = new Smartphone("Samsung", "Galaxy S23");
        
        System.out.println("\n--- Llamada a método con super.metodo() ---");
        miCelular.encender();
    }
}
