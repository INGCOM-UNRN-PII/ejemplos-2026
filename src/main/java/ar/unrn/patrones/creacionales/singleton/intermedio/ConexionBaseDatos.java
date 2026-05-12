package ar.unrn.patrones.creacionales.singleton.intermedio;

/**
 * Centraliza el acceso a una unica instancia compartida para que el resto del codigo no cree copias inconsistentes del mismo recurso.
 * El paquete amplia Singleton con una implementacion mas realista que centraliza un recurso compartido por toda la aplicacion.
 */
public class ConexionBaseDatos {
    private static volatile ConexionBaseDatos instancia;
    private final String url;

    /**
     * Constructor privado.
     */
    private ConexionBaseDatos() {
        this.url = "jdbc:mysql://localhost:3306/mi_db";
    }

    /**
     * Obtiene la instancia única de forma segura para hilos.
     * 
     * @return la instancia única.
     */
    public static ConexionBaseDatos obtenerInstancia() {
        if (instancia == null) {
            synchronized (ConexionBaseDatos.class) {
                if (instancia == null) {
                    instancia = new ConexionBaseDatos();
                }
            }
        }
        return instancia;
    }

    /**
     * Simula la conexión a la base de datos.
     */
    public void conectar() {
        System.out.println("Conectado a: " + url);
    }
}
