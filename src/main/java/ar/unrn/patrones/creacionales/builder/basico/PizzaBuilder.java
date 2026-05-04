package ar.unrn.patrones.creacionales.builder.basico;

/**
 * Producto Pizza.
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
 * Builder para Pizza.
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
