package ar.unrn.refactoring.patrones_diseno.avanzado.estructurales.adapter;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el dominio bancario habla directo con APIs externas incompatibles.
 */
public class MotorIntegracionBancaria {
    private final TransferLegacy legacy = new TransferLegacy();
    private final WireVendor vendor = new WireVendor();

    public boolean transferir(String proveedor, String cuenta, double monto) {
        if ("legacy".equals(proveedor)) {
            return legacy.send(cuenta, (int) monto).equals("OK");
        }
        return vendor.exec(cuenta, monto, "ARS") == 0;
    }
}

class TransferLegacy {
    public String send(String account, int amount) { return amount > 0 ? "OK" : "FAIL"; }
}

class WireVendor {
    public int exec(String iban, double amount, String currency) { return amount > 0 && "ARS".equals(currency) ? 0 : 1; }
}
