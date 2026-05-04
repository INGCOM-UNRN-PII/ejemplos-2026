package ar.unrn.patrones.creacionales.abstract_factory.avanzado;

/** Productos complejos de BD. */
interface Conexion { void abrir(); }
interface Comando { void ejecutar(String sql); }

/** SQL Server. */
class SqlConexion implements Conexion { @Override public void abrir() { System.out.println("Abriendo conexión T-SQL..."); } }
class SqlComando implements Comando { @Override public void ejecutar(String sql) { System.out.println("Ejecutando T-SQL: " + sql); } }

/** NoSQL (MongoDB). */
class MongoConexion implements Conexion { @Override public void abrir() { System.out.println("Conectando a cluster MongoDB..."); } }
class MongoComando implements Comando { @Override public void ejecutar(String sql) { System.out.println("Ejecutando Query MQL: " + sql); } }

/**
 * Fábrica Abstracta para componentes de base de datos.
 */
public interface FabricaDatos {
    /** @return objeto de conexión. */
    Conexion crearConexion();
    /** @return objeto de comando. */
    Comando crearComando();
}
