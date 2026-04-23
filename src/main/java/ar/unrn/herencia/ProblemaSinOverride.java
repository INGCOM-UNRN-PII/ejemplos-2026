package ar.unrn.generados.herencia;

/**
 * Ejemplo de los problemas de no usar la anotación @Override.
 * 
 * Sin la anotación, si cometemos un error en la firma del método,
 * el compilador lo tratará como un método nuevo (sobrecarga) en lugar
 * de advertirnos que no estamos sobreescribiendo nada.
 */
public class ProblemaSinOverride {

    static class Padre {
        public void mostrarMensaje(String texto) {
            System.out.println("Padre: " + texto);
        }
    }

    static class Hijo extends Padre {
        // ERROR SUTIL: El programador quería sobreescribir, pero escribió mal el nombre.
        // Sin @Override, esto compila pero NO sobreescribe. Es un método nuevo.
        public void mostrarMezaje(String texto) {
            System.out.println("Hijo (error tipográfico): " + texto);
        }

        // ERROR DE FIRMA: Cambió el tipo de parámetro.
        // Sin @Override, esto es una sobrecarga, no una sobreescritura.
        public void mostrarMensaje(Object texto) {
            System.out.println("Hijo (sobrecarga): " + texto);
        }
        
        /* 
        @Override
        public void mostrarMensaje(Integer n) { } 
        // ^ Si descomentamos esto, el compilador daría ERROR porque no existe 
        // tal método en el padre con esa firma exacta.
        */
    }

    public static void main(String[] args) {
        Padre objeto = new Hijo();
        
        System.out.println("--- Problemas sin @Override ---");
        // El programador espera el mensaje del Hijo, pero se ejecuta el del Padre
        // porque nunca hubo sobreescritura real.
        objeto.mostrarMensaje("Hola Mundo");
    }
}
