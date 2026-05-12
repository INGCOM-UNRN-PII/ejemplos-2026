package ar.unrn.smells.acoplamiento;

/**
 * Representa una pieza del ejemplo de acoplamiento y deja visible por que una clase depende de demasiados detalles de otras.
 * El paquete muestra acoplamiento excesivo y permite ver cuando una clase queda trabada a demasiados detalles de sus colaboradoras.
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
 * Representa una pieza del ejemplo de acoplamiento y deja visible por que una clase depende de demasiados detalles de otras.
 * El paquete muestra acoplamiento excesivo y permite ver cuando una clase queda trabada a demasiados detalles de sus colaboradoras.
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
 * Representa una pieza del ejemplo de acoplamiento y deja visible por que una clase depende de demasiados detalles de otras.
 * El paquete muestra acoplamiento excesivo y permite ver cuando una clase queda trabada a demasiados detalles de sus colaboradoras.
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
 * Representa una pieza del ejemplo de acoplamiento y deja visible por que una clase depende de demasiados detalles de otras.
 * El paquete muestra acoplamiento excesivo y permite ver cuando una clase queda trabada a demasiados detalles de sus colaboradoras.
 */
class Auto {
    /** Temperatura del agua del motor. */
    public int temperaturaAgua = 20;
    /** Estado del ventilador de refrigeración. */
    public boolean ventiladorEncendido = false;
}

/**
 * Representa una pieza del ejemplo de acoplamiento y deja visible por que una clase depende de demasiados detalles de otras.
 * El paquete muestra acoplamiento excesivo y permite ver cuando una clase queda trabada a demasiados detalles de sus colaboradoras.
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
