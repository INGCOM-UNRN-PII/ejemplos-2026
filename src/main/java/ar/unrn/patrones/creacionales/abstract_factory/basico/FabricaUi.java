package ar.unrn.patrones.creacionales.abstract_factory.basico;

/** Productos abstractos: Botón y Checkbox. */
interface Boton { void renderizar(); }
interface Checkbox { void renderizar(); }

/** Familia Windows. */
class BotonWindows implements Boton { @Override public void renderizar() { System.out.println("Botón estilo Windows"); } }
class CheckboxWindows implements Checkbox { @Override public void renderizar() { System.out.println("Checkbox estilo Windows"); } }

/** Familia Mac. */
class BotonMac implements Boton { @Override public void renderizar() { System.out.println("Botón estilo Mac"); } }
class CheckboxMac implements Checkbox { @Override public void renderizar() { System.out.println("Checkbox estilo Mac"); } }

/**
 * Fábrica Abstracta para componentes UI.
 */
public interface FabricaUi {
    /** @return un nuevo botón. */
    Boton crearBoton();
    /** @return un nuevo checkbox. */
    Checkbox crearCheckbox();
}
