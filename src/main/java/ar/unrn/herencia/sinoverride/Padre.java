package ar.unrn.herencia.sinoverride;

/**
 * Aporta la implementacion base del ejemplo y permite contrastar que ocurre cuando una subclase no sobrescribe exactamente la misma firma.
 * El paquete muestra que redefinir un metodo con una firma distinta no equivale a sobrescribirlo y puede esconder errores sutiles.
 */
public class Padre {
    public void mostrarMensaje(String texto) {
        System.out.println("Padre: " + texto);
    }
}
