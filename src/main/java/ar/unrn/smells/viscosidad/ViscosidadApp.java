package ar.unrn.smells.viscosidad;

public class ViscosidadApp {
    public static void main(String[] args) {
        System.out.println("--- Smell: Viscosidad ---");
        AtajoSucio.DATO_COMPARTIDO = "Valor hackeado";
        new Capa10().procesar();
        new LoggerViscoso().log("Evento importante");
    }
}
