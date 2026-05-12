package ar.unrn.herencia.sinoverride;

/**
 * Introduce la firma conflictiva del ejemplo para mostrar que una sobrecarga accidental no reemplaza el comportamiento heredado.
 * El paquete muestra que redefinir un metodo con una firma distinta no equivale a sobrescribirlo y puede esconder errores sutiles.
 */
public class Hijo extends Padre {
    public void mostrarMezaje(String texto) {
        System.out.println("Hijo (error tipográfico): " + texto);
    }

    public void mostrarMensaje(Object texto) {
        System.out.println("Hijo (sobrecarga): " + texto);
    }
}
