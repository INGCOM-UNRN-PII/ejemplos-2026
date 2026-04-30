package ar.unrn.smells.inseparabilidad;

public class InseparabilidadApp {
    public static void main(String[] args) {
        System.out.println("--- Smell: Inseparabilidad ---");
        new VentanaFactura().alHacerClick();
        new ValidadorUsuario().esValido("admin");
    }
}
