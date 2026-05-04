package ar.unrn.patrones.creacionales.prototype.basico;

/**
 * Interfaz Prototype para figuras.
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

/** Clonación básica de un círculo. */
class CirculoPrototype extends FiguraPrototype {
    private int radio;
    public CirculoPrototype(int radio) { this.radio = radio; }
    @Override public void dibujar() { System.out.println("Círculo [radio=" + radio + ", color=" + color + "]"); }
}
