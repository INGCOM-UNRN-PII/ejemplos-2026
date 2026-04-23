package ar.unrn.excepciones;

/**
 * Ejemplo de captura de excepciones en diferentes niveles de la jerarquía.
 */
public class DemoExcepciones {

    public static void main(String[] args) {
        System.out.println("--- Inicio de operaciones bancarias ---");

        // Caso 1: Captura específica
        intentarRetirar("Cuenta-001", 1000, 5000);

        System.out.println("\n---------------------------------------\n");

        // Caso 2: Captura por jerarquía superior
        intentarOperacionInsegura();
    }

    private static void intentarRetirar(String id, double saldo, double monto) {
        try {
            System.out.println("Intentando retirar $" + monto + " de " + id);
            realizarRetiro(saldo, monto);
            System.out.println("Retiro exitoso.");
        } catch (SaldoInsuficienteException e) {
            System.err.println("[CAPTURA ESPECÍFICA] Error de saldo: " + e.getMessage());
            System.err.println("Saldo actual del cliente: " + e.getSaldoActual());
        } catch (BancoException e) {
            System.err.println("[CAPTURA BASE] Error general del banco: " + e.getMessage());
        }
    }

    /**
     * Este método declara que puede lanzar BancoException.
     */
    private static void realizarRetiro(double saldo, double monto) throws BancoException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException(saldo, monto);
        }
    }

    private static void intentarOperacionInsegura() {
        try {
            System.out.println("Iniciando operación en cuenta bloqueada...");
            ejecutarAccionBloqueada();
        } catch (SaldoInsuficienteException e) {
            // Ahora este catch es válido porque ejecutarAccionBloqueada declara throws BancoException
            System.err.println("Saldo insuficiente inesperado.");
        } catch (BancoException e) {
            System.err.println("[CAPTURA BASE] Manejando error de cuenta: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("[CAPTURA SISTEMA] Error inesperado: " + e.toString());
        }
    }

    private static void ejecutarAccionBloqueada() throws BancoException {
        throw new CuentaBloqueadaException("Cuenta-999");
    }
}
