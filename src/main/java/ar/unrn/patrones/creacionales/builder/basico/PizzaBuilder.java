package ar.unrn.patrones.creacionales.builder.basico;

/**
 * Representa el objeto complejo que el builder arma gradualmente y entrega al cliente una vez que la configuracion quedo consolidada.
 * El paquete introduce Builder con un ejemplo minimo para separar configuracion incremental de construccion final del objeto.
 */
class Pizza {
    private String masa = "";
    private String salsa = "";
    private String extra = "";

    public void establecerMasa(String masa) { this.masa = masa; }
    public void establecerSalsa(String salsa) { this.salsa = salsa; }
    public void establecerExtra(String extra) { this.extra = extra; }

    @Override public String toString() { return "Pizza [masa=" + masa + ", salsa=" + salsa + ", extra=" + extra + "]"; }
}

/**
 * Representa el objeto complejo que el builder arma gradualmente y entrega al cliente una vez que la configuracion quedo consolidada.
 * El paquete introduce Builder con un ejemplo minimo para separar configuracion incremental de construccion final del objeto.
 */
public abstract class PizzaBuilder {
    protected Pizza pizza;

    /** @return el producto terminado. */
    public Pizza obtenerPizza() { return pizza; }
    /** Inicializa el producto. */
    public void crearNuevaPizza() { pizza = new Pizza(); }

    /** Paso: Construir masa. */
    public abstract void construirMasa();
    /** Paso: Construir salsa. */
    public abstract void construirSalsa();
    /** Paso: Construir extra. */
    public abstract void construirExtra();
}
