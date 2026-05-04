package ar.unrn.patrones.creacionales.factory_method.basico;

/**
 * Interfaz para productos de tipo Figura.
 */
interface Figura {
    /** Dibuja la figura. */
    void dibujar();
}

/** Producto concreto Círculo. */
class Circulo implements Figura {
    @Override public void dibujar() { System.out.println("Dibujando Círculo"); }
}

/** Producto concreto Cuadrado. */
class Cuadrado implements Figura {
    @Override public void dibujar() { System.out.println("Dibujando Cuadrado"); }
}

/**
 * Creador básico (Factory Method).
 */
public abstract class FabricaFiguras {
    /**
     * Método fábrica que debe ser implementado por subclases.
     * 
     * @return una nueva instancia de Figura.
     */
    public abstract Figura crearFigura();

    /**
     * Lógica de negocio que utiliza el producto.
     */
    public void renderizar() {
        Figura f = crearFigura();
        f.dibujar();
    }
}
