package ar.unrn.refactoring.patrones_diseno.basico.estructurales.adapter;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el checkout usa directamente un proveedor legado con una interfaz ajena al dominio.
 */
public class CheckoutTienda {
    private final CobroLegacy legacy = new CobroLegacy();

    public boolean cobrar(double monto) {
        String respuesta = legacy.makePayment((int) monto, "ARS");
        return "OK".equals(respuesta);
    }
}

class CobroLegacy {
    public String makePayment(int amount, String currency) {
        return amount > 0 && "ARS".equals(currency) ? "OK" : "FAIL";
    }
}
