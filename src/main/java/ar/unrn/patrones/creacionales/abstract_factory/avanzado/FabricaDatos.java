package ar.unrn.patrones.creacionales.abstract_factory.avanzado;

/**
 * Define el producto abstracto de conexion para que la fabrica entregue una familia consistente sin exponer implementaciones concretas.
 * El paquete aplica Abstract Factory a componentes de acceso a datos para cambiar familias completas de objetos sin tocar el cliente.
 */
interface Conexion { void abrir(); }
/**
 * Define el producto abstracto que ejecuta operaciones contra la fuente de datos elegida por la fabrica.
 * El paquete aplica Abstract Factory a componentes de acceso a datos para cambiar familias completas de objetos sin tocar el cliente.
 */
interface Comando { void ejecutar(String sql); }

/**
 * Representa una conexion concreta dentro de una familia de productos y mantiene alineada la variante elegida por la fabrica.
 * El paquete aplica Abstract Factory a componentes de acceso a datos para cambiar familias completas de objetos sin tocar el cliente.
 */
class SqlConexion implements Conexion { @Override public void abrir() { System.out.println("Abriendo conexión T-SQL..."); } }
/**
 * Representa un comando concreto dentro de una familia de productos y ejecuta operaciones segun la tecnologia seleccionada.
 * El paquete aplica Abstract Factory a componentes de acceso a datos para cambiar familias completas de objetos sin tocar el cliente.
 */
class SqlComando implements Comando { @Override public void ejecutar(String sql) { System.out.println("Ejecutando T-SQL: " + sql); } }

/**
 * Representa una conexion concreta dentro de una familia de productos y mantiene alineada la variante elegida por la fabrica.
 * El paquete aplica Abstract Factory a componentes de acceso a datos para cambiar familias completas de objetos sin tocar el cliente.
 */
class MongoConexion implements Conexion { @Override public void abrir() { System.out.println("Conectando a cluster MongoDB..."); } }
/**
 * Representa un comando concreto dentro de una familia de productos y ejecuta operaciones segun la tecnologia seleccionada.
 * El paquete aplica Abstract Factory a componentes de acceso a datos para cambiar familias completas de objetos sin tocar el cliente.
 */
class MongoComando implements Comando { @Override public void ejecutar(String sql) { System.out.println("Ejecutando Query MQL: " + sql); } }

/**
 * Centraliza la creacion de objetos relacionados para que el cliente trabaje contra contratos estables y no contra constructores concretos.
 * El paquete aplica Abstract Factory a componentes de acceso a datos para cambiar familias completas de objetos sin tocar el cliente.
 */
public interface FabricaDatos {
    /** @return objeto de conexión. */
    Conexion crearConexion();
    /** @return objeto de comando. */
    Comando crearComando();
}
