package ar.unrn.refactoring.patrones_diseno.intermedio.comportamiento.strategy;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde una variacion por tipo de envio se prepara para migrar a estrategias explicitas.
 */
public class Pedido {
    /**
     * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
     * El paquete concentra un ejercicio donde una variacion por tipo de envio se prepara para migrar a estrategias explicitas.
     */
    public enum TipoEnvio {ESTANDAR, EXPRESS, INTERNACIONAL}

    private TipoEnvio tipo;
    private double peso;

    /**
     * Crea un nuevo pedido.
     *
     * @param tipo el tipo de envio seleccionado.
     * @param peso el peso del paquete en kilogramos.
     */
    public Pedido(TipoEnvio tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    /**
     * Calcula el costo de envio basado en el tipo y peso.
     * METODO A REFACTORIZAR: Logica de negocio atada a un enum dentro de la clase.
     *
     * @return el costo total del envio.
     * @throws IllegalArgumentException si el tipo de envio es desconocido.
     */
    public double calcularCostoEnvio() {
        return switch (tipo) {
            case ESTANDAR -> peso * 5;
            case EXPRESS -> (peso * 5) + 20;
            case INTERNACIONAL -> (peso * 10) + 50;
        };
    }
}
