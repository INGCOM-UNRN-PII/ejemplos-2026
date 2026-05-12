package ar.unrn.refactoring.strategy;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde una variacion por tipo de envio se prepara para migrar a estrategias explicitas.
 */
public class Pedido {
    /**
     * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
     * El paquete concentra un ejercicio donde una variacion por tipo de envio se prepara para migrar a estrategias explicitas.
     */
    public enum TipoEnvio { ESTANDAR, EXPRESS, INTERNACIONAL }

    private TipoEnvio tipo;
    private double peso;

    /**
     * Crea un nuevo pedido.
     * 
     * @param tipo el tipo de envío seleccionado.
     * @param peso el peso del paquete en kilogramos.
     */
    public Pedido(TipoEnvio tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    /**
     * Calcula el costo de envío basado en el tipo y peso.
     * MÉTODO A REFACTORIZAR: Lógica de negocio atada a un enum dentro de la clase.
     * 
     * @return el costo total del envío.
     * @throws IllegalArgumentException si el tipo de envío es desconocido.
     */
    public double calcularCostoEnvio() {
        switch (tipo) {
            case ESTANDAR:
                return peso * 5;
            case EXPRESS:
                return (peso * 5) + 20;
            case INTERNACIONAL:
                return (peso * 10) + 50;
            default:
                throw new IllegalArgumentException("Tipo desconocido");
        }
    }
}
