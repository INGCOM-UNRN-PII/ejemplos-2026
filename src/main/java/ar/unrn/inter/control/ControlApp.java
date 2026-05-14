package ar.unrn.inter.control;

/**
 * Demuestra interdependencia por control.
 */
public class ControlApp {

    /**
     * Ejecuta el ejemplo.
     *
     * @param args argumentos no utilizados.
     */
    public static void main(String[] args) {
        ProcesadorPedidos procesador = new ProcesadorPedidos();
        Pedido pedido = new Pedido("P-100", 2500);

        System.out.println(procesador.procesar(pedido, true, true, false));
        System.out.println(procesador.procesar(pedido, false, false, true));
    }
}

final class ProcesadorPedidos {
    String procesar(Pedido pedido, boolean urgente, boolean notificar, boolean auditar) {
        String resultado = urgente
                ? "Procesamiento urgente de " + pedido.codigo()
                : "Procesamiento normal de " + pedido.codigo();

        if (notificar) {
            resultado += " | notifica al cliente";
        }
        if (auditar) {
            resultado += " | registra auditoria";
        }
        return resultado;
    }
}

record Pedido(String codigo, double total) {
}
