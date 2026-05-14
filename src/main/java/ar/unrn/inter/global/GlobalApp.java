package ar.unrn.inter.global;

/**
 * Demuestra interdependencia global.
 */
public class GlobalApp {

    /**
     * Ejecuta el ejemplo.
     *
     * @param args argumentos no utilizados.
     */
    public static void main(String[] args) {
        PanelOperador panel = new PanelOperador();
        ServicioFacturacion facturacion = new ServicioFacturacion();

        System.out.println(facturacion.emitirFactura("Pedido-1"));
        panel.activarAuditoria();
        System.out.println(facturacion.emitirFactura("Pedido-2"));
    }
}

final class ConfiguracionGlobal {
    static boolean auditoriaActiva = false;
    static String region = "AR";

    private ConfiguracionGlobal() {
    }
}

final class PanelOperador {
    void activarAuditoria() {
        ConfiguracionGlobal.auditoriaActiva = true;
    }
}

final class ServicioFacturacion {
    String emitirFactura(String pedido) {
        if (ConfiguracionGlobal.auditoriaActiva) {
            return "Factura auditada para " + pedido + " en " + ConfiguracionGlobal.region;
        }
        return "Factura simple para " + pedido + " en " + ConfiguracionGlobal.region;
    }
}
