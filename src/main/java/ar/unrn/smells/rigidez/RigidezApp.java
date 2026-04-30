package ar.unrn.smells.rigidez;

public class RigidezApp {
    public static void main(String[] args) {
        System.out.println("--- Smell: Rigidez ---");
        new GeneradorReporte().exportar("datos", "PDF");
        new SistemaCaja().cobrar();
    }
}
