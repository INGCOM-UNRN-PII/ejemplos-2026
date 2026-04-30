package ar.unrn.smells.acoplamiento;

public class AcoplamientoApp {
    public static void main(String[] args) {
        System.out.println("--- Smell: Acoplamiento ---");
        ProcesadorPedido p = new ProcesadorPedido();
        p.procesar("Notebook");

        Auto miAuto = new Auto();
        miAuto.temperaturaAgua = 100;
        new Motor().chequear(miAuto);
        System.out.println("Ventilador: " + miAuto.ventiladorEncendido);
    }
}
