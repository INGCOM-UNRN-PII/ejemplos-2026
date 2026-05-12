package ar.unrn.patrones.creacionales.factory_method.basico;

/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete explica Factory Method delegando en subclases la decision sobre que producto concreto crear.
 */
interface Figura {
    /** Dibuja la figura. */
    void dibujar();
}

/**
 * Representa uno de los productos del ejemplo y deja que el metodo fabrica decida cuando y con que variante crearlo.
 * El paquete explica Factory Method delegando en subclases la decision sobre que producto concreto crear.
 */
class Circulo implements Figura {
    @Override public void dibujar() { System.out.println("Dibujando Círculo"); }
}

/**
 * Representa uno de los productos del ejemplo y deja que el metodo fabrica decida cuando y con que variante crearlo.
 * El paquete explica Factory Method delegando en subclases la decision sobre que producto concreto crear.
 */
class Cuadrado implements Figura {
    @Override public void dibujar() { System.out.println("Dibujando Cuadrado"); }
}

/**
 * Centraliza la creacion de objetos relacionados para que el cliente trabaje contra contratos estables y no contra constructores concretos.
 * El paquete explica Factory Method delegando en subclases la decision sobre que producto concreto crear.
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
