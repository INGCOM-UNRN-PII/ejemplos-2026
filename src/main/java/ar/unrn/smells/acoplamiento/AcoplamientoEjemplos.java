package ar.unrn.smells.acoplamiento;

/**
 * Ejemplo 1: Acoplamiento fuerte por dependencia de clases concretas.
 * ProcesadorPedido está atado a EmailService y SqlDatabase.
 */
class ProcesadorPedido {
    private EmailService emailService = new EmailService();
    private SqlDatabase database = new SqlDatabase();

    /**
     * Procesa un pedido guardándolo en la base de datos y enviando un email.
     * 
     * @param pedido descripción del pedido a procesar.
     */
    public void procesar(String pedido) {
        database.guardar(pedido);
        emailService.enviar("Confirmación de " + pedido);
    }
}

/**
 * Servicio simulado para envío de correos electrónicos.
 */
class EmailService { 
    /**
     * Simula el envío de un mensaje.
     * 
     * @param msg el contenido del mensaje.
     */
    void enviar(String msg) { System.out.println("Enviando email: " + msg); } 
}

/**
 * Servicio simulado para persistencia en base de datos SQL.
 */
class SqlDatabase { 
    /**
     * Simula el guardado de datos.
     * 
     * @param data los datos a persistir.
     */
    void guardar(String data) { System.out.println("Guardando en SQL: " + data); } 
}

/**
 * Ejemplo 2: Intimidad inapropiada.
 * Representa un auto con campos públicos que exponen su estado interno.
 */
class Auto {
    /** Temperatura del agua del motor. */
    public int temperaturaAgua = 20;
    /** Estado del ventilador de refrigeración. */
    public boolean ventiladorEncendido = false;
}

/**
 * Motor que manipula directamente el estado interno de la clase Auto.
 */
class Motor {
    /**
     * Chequea la temperatura del auto y activa el ventilador si es necesario.
     * 
     * @param auto el auto a chequear.
     */
    public void chequear(Auto auto) {
        if (auto.temperaturaAgua > 90) {
            auto.ventiladorEncendido = true; // El motor conoce y modifica el estado interno del auto
        }
    }
}
