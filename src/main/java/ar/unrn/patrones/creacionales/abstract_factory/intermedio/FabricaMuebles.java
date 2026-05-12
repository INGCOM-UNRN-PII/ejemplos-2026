package ar.unrn.patrones.creacionales.abstract_factory.intermedio;

/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete aplica Abstract Factory a familias de muebles para que el cliente combine variantes compatibles sin conocer clases concretas.
 */
interface Silla { void sentarse(); }
/**
 * Define el producto abstracto de la familia de muebles y fija el contrato comun que comparten sus variantes.
 * El paquete aplica Abstract Factory a familias de muebles para que el cliente combine variantes compatibles sin conocer clases concretas.
 */
interface Sofa { void acostarse(); }

/**
 * Representa un producto concreto de una familia y asegura que las variantes creadas por la misma fabrica sean compatibles entre si.
 * El paquete aplica Abstract Factory a familias de muebles para que el cliente combine variantes compatibles sin conocer clases concretas.
 */
class SillaModerna implements Silla { @Override public void sentarse() { System.out.println("Sentado en silla minimalista moderna."); } }
/**
 * Representa un producto concreto de una familia y asegura que las variantes creadas por la misma fabrica sean compatibles entre si.
 * El paquete aplica Abstract Factory a familias de muebles para que el cliente combine variantes compatibles sin conocer clases concretas.
 */
class SofaModerno implements Sofa { @Override public void acostarse() { System.out.println("Acostado en sofá moderno gris."); } }

/**
 * Representa un producto concreto de una familia y asegura que las variantes creadas por la misma fabrica sean compatibles entre si.
 * El paquete aplica Abstract Factory a familias de muebles para que el cliente combine variantes compatibles sin conocer clases concretas.
 */
class SillaVictoriana implements Silla { @Override public void sentarse() { System.out.println("Sentado en silla victoriana ornamentada."); } }
/**
 * Representa un producto concreto de una familia y asegura que las variantes creadas por la misma fabrica sean compatibles entre si.
 * El paquete aplica Abstract Factory a familias de muebles para que el cliente combine variantes compatibles sin conocer clases concretas.
 */
class SofaVictoriano implements Sofa { @Override public void acostarse() { System.out.println("Acostado en sofá victoriano de terciopelo."); } }

/**
 * Centraliza la creacion de objetos relacionados para que el cliente trabaje contra contratos estables y no contra constructores concretos.
 * El paquete aplica Abstract Factory a familias de muebles para que el cliente combine variantes compatibles sin conocer clases concretas.
 */
public interface FabricaMuebles {
    /** @return una silla de un estilo específico. */
    Silla crearSilla();
    /** @return un sofá de un estilo específico. */
    Sofa crearSofa();
}
