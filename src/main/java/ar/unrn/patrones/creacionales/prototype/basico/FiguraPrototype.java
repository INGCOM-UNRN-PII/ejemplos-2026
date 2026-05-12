package ar.unrn.patrones.creacionales.prototype.basico;

/**
 * Representa el objeto que el ejemplo necesita clonar para reutilizar una configuracion ya preparada con el menor costo posible.
 * El paquete introduce Prototype con un ejemplo minimo donde la clonacion reemplaza construcciones repetitivas.
 */
public abstract class FiguraPrototype implements Cloneable {
    protected String color;

    /** @return clon del objeto */
    @Override
    public FiguraPrototype clone() {
        try {
            return (FiguraPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void establecerColor(String color) { this.color = color; }
    public abstract void dibujar();
}

/**
 * Representa el objeto que el ejemplo necesita clonar para reutilizar una configuracion ya preparada con el menor costo posible.
 * El paquete introduce Prototype con un ejemplo minimo donde la clonacion reemplaza construcciones repetitivas.
 */
class CirculoPrototype extends FiguraPrototype {
    private int radio;
    public CirculoPrototype(int radio) { this.radio = radio; }
    @Override public void dibujar() { System.out.println("Círculo [radio=" + radio + ", color=" + color + "]"); }
}
