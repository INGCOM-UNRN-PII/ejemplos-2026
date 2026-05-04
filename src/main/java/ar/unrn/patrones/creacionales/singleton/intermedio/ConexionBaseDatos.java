package ar.unrn.patrones.creacionales.singleton.intermedio;

/**
 * Ejemplo intermedio de Singleton utilizando Double-Checked Locking.
 * Es seguro para hilos y eficiente.
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
