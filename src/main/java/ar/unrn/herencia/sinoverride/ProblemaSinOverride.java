package ar.unrn.herencia.sinoverride;
public class ProblemaSinOverride {
    public static void main(String[] args) {
        Padre objeto = new Hijo();
        System.out.println("--- Problemas sin @Override ---");
        objeto.mostrarMensaje("Hola Mundo");
    }
}
