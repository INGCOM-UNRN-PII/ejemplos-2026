package ar.unrn.patrones.creacionales.abstract_factory.intermedio;

/** Productos: Silla y Sofá. */
interface Silla { void sentarse(); }
interface Sofa { void acostarse(); }

/** Estilo Moderno. */
class SillaModerna implements Silla { @Override public void sentarse() { System.out.println("Sentado en silla minimalista moderna."); } }
class SofaModerno implements Sofa { @Override public void acostarse() { System.out.println("Acostado en sofá moderno gris."); } }

/** Estilo Victoriano. */
class SillaVictoriana implements Silla { @Override public void sentarse() { System.out.println("Sentado en silla victoriana ornamentada."); } }
class SofaVictoriano implements Sofa { @Override public void acostarse() { System.out.println("Acostado en sofá victoriano de terciopelo."); } }

/**
 * Fábrica Abstracta para muebles.
 */
public interface FabricaMuebles {
    /** @return una silla de un estilo específico. */
    Silla crearSilla();
    /** @return un sofá de un estilo específico. */
    Sofa crearSofa();
}
