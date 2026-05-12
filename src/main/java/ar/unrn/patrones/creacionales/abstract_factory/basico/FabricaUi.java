package ar.unrn.patrones.creacionales.abstract_factory.basico;

/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete aplica Abstract Factory a widgets de interfaz para crear componentes compatibles con cada sistema operativo.
 */
interface Boton { void renderizar(); }
/**
 * Define el widget abstracto que las fabricas de interfaz deben producir manteniendo coherencia visual entre plataformas.
 * El paquete aplica Abstract Factory a widgets de interfaz para crear componentes compatibles con cada sistema operativo.
 */
interface Checkbox { void renderizar(); }

/**
 * Representa un producto concreto de una familia y asegura que las variantes creadas por la misma fabrica sean compatibles entre si.
 * El paquete aplica Abstract Factory a widgets de interfaz para crear componentes compatibles con cada sistema operativo.
 */
class BotonWindows implements Boton { @Override public void renderizar() { System.out.println("Botón estilo Windows"); } }
/**
 * Representa un producto concreto de una familia y asegura que las variantes creadas por la misma fabrica sean compatibles entre si.
 * El paquete aplica Abstract Factory a widgets de interfaz para crear componentes compatibles con cada sistema operativo.
 */
class CheckboxWindows implements Checkbox { @Override public void renderizar() { System.out.println("Checkbox estilo Windows"); } }

/**
 * Representa un producto concreto de una familia y asegura que las variantes creadas por la misma fabrica sean compatibles entre si.
 * El paquete aplica Abstract Factory a widgets de interfaz para crear componentes compatibles con cada sistema operativo.
 */
class BotonMac implements Boton { @Override public void renderizar() { System.out.println("Botón estilo Mac"); } }
/**
 * Representa un producto concreto de una familia y asegura que las variantes creadas por la misma fabrica sean compatibles entre si.
 * El paquete aplica Abstract Factory a widgets de interfaz para crear componentes compatibles con cada sistema operativo.
 */
class CheckboxMac implements Checkbox { @Override public void renderizar() { System.out.println("Checkbox estilo Mac"); } }

/**
 * Centraliza la creacion de objetos relacionados para que el cliente trabaje contra contratos estables y no contra constructores concretos.
 * El paquete aplica Abstract Factory a widgets de interfaz para crear componentes compatibles con cada sistema operativo.
 */
public interface FabricaUi {
    /** @return un nuevo botón. */
    Boton crearBoton();
    /** @return un nuevo checkbox. */
    Checkbox crearCheckbox();
}
