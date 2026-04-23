package ar.unrn.dos.estaticos.contadorinstancias; // Nota: 'static' es una palabra reservada en Java, por lo que usamos 'estaticos' para el paquete.

/**
 * Clase de ejemplo para demostrar el uso de miembros estáticos (de clase)
 * en contraposición a los miembros de instancia (de objeto).
 */
public class ContadorInstancias {

    // --- MIEMBROS ESTÁTICOS (Pertenecen a la CLASE, compartidos por todos los objetos) ---

    /**
     * Constante estática. Es compartida por todos y no puede cambiar.
     * Convención: Las constantes estáticas van en MAYÚSCULAS_CON_GUIONES_BAJOS.
     */
    public static final String PREFIJO_ID = "OBJ-";

    /**
     * Variable estática. Existe una sola copia en memoria para toda la clase.
     * Se usa aquí para llevar la cuenta total de cuántos objetos se han instanciado.
     */
    private static int cantidadTotalCreada = 0;


    // --- MIEMBROS DE INSTANCIA (Pertenecen al OBJETO, cada uno tiene su propia copia) ---

    /**
     * Variable de instancia. Cada objeto tiene su propio 'id'.
     */
    private final String id;

    /**
     * Constructor. Se ejecuta cada vez que se crea un NUEVO objeto con 'new'.
     */
    public ContadorInstancias() {
        // Incrementamos la variable ESTÁTICA compartida
        cantidadTotalCreada++;
        
        // Asignamos la variable de INSTANCIA usando la estática compartida
        this.id = PREFIJO_ID + cantidadTotalCreada;
    }

    /**
     * Método de instancia. Pertenece al objeto.
     * Puede acceder tanto a miembros de instancia ('id') como estáticos ('PREFIJO_ID').
     */
    public String getId() {
        return this.id;
    }

    /**
     * Método estático. Pertenece a la clase, no a ningún objeto en particular.
     * SOLO puede acceder a otros miembros estáticos (no tiene acceso a 'this' ni a 'id').
     * 
     * @return La cantidad total de instancias creadas hasta el momento.
     */
    public static int getCantidadTotalCreada() {
        // return this.id; // ¡ESTO DARÍA ERROR DE COMPILACIÓN!
        return cantidadTotalCreada;
    }
}
