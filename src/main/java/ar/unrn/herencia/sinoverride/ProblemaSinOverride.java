package ar.unrn.herencia.sinoverride;

/**
 * Ejecuta el escenario que deja en evidencia por que la anotacion @Override ayuda a detectar errores de firma en herencia.
 * El paquete muestra que redefinir un metodo con una firma distinta no equivale a sobrescribirlo y puede esconder errores sutiles.
 */
public class ProblemaSinOverride {
    public static void main(String[] args) {
        Padre objeto = new Hijo();
        System.out.println("--- Problemas sin @Override ---");
        objeto.mostrarMensaje("Hola Mundo");
    }
}
