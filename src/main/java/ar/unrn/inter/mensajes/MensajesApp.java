package ar.unrn.inter.mensajes;

/**
 * Demuestra interdependencia por mensajes.
 */
public class MensajesApp {

    /**
     * Ejecuta el ejemplo.
     *
     * @param args argumentos no utilizados.
     */
    public static void main(String[] args) {
        Factura factura = new Factura(4000, 35);
        GestorCobranzas cobranzas = new GestorCobranzas();

        cobranzas.aplicarRecargo(factura);
        System.out.println(factura.resumen());
    }
}

final class GestorCobranzas {
    void aplicarRecargo(Factura factura) {
        factura.aplicarRecargoPorMora();
    }
}

final class Factura {
    private double saldo;
    private int diasDeMora;

    Factura(double saldo, int diasDeMora) {
        this.saldo = saldo;
        this.diasDeMora = diasDeMora;
    }

    void aplicarRecargoPorMora() {
        if (diasDeMora > 30) {
            saldo += saldo * 0.12;
        }
    }

    String resumen() {
        return "saldo=" + saldo + ", diasDeMora=" + diasDeMora;
    }
}
