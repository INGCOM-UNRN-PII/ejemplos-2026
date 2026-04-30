package ar.unrn.smells.acoplamiento;

/**
 * Ejemplo 1: Acoplamiento fuerte por dependencia de clases concretas.
 * ProcesadorPedido está atado a EmailService y SqlDatabase.
 */
class ProcesadorPedido {
    private EmailService emailService = new EmailService();
    private SqlDatabase database = new SqlDatabase();

    public void procesar(String pedido) {
        database.guardar(pedido);
        emailService.enviar("Confirmación de " + pedido);
    }
}

class EmailService { void enviar(String msg) { System.out.println("Enviando email: " + msg); } }
class SqlDatabase { void guardar(String data) { System.out.println("Guardando en SQL: " + data); } }

/**
 * Ejemplo 2: Intimidad inapropiada.
 * Motor accede y modifica campos internos de Auto de forma excesiva.
 */
class Auto {
    public int temperaturaAgua = 20;
    public boolean ventiladorEncendido = false;
}

class Motor {
    public void chequear(Auto auto) {
        if (auto.temperaturaAgua > 90) {
            auto.ventiladorEncendido = true; // El motor conoce y modifica el estado interno del auto
        }
    }
}
