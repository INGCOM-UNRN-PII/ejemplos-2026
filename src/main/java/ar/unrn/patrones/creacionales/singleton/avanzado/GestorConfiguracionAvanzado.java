package ar.unrn.patrones.creacionales.singleton.avanzado;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo avanzado de Singleton utilizando el patrón Bill Pugh (Static Inner Class).
 * Es la forma más recomendada en Java por ser thread-safe y lazy sin sincronización explícita.
 */
public class GestorConfiguracionAvanzado {
    private final Map<String, String> configuraciones;

    /**
     * Constructor privado que carga configuraciones iniciales.
     */
    private GestorConfiguracionAvanzado() {
        configuraciones = new HashMap<>();
        configuraciones.put("app.nombre", "Sistema Avanzado");
        configuraciones.put("app.version", "1.0.0");
    }

    /**
     * Encapsula la instancia unica del singleton y aprovecha la carga diferida de clases para crearla solo cuando realmente se necesita.
     * El paquete muestra una variante robusta de Singleton que retrasa la creacion de la instancia y evita sincronizacion explicita.
     */
    private static class Holder {
        private static final GestorConfiguracionAvanzado INSTANCIA = new GestorConfiguracionAvanzado();
    }

    /**
     * Obtiene la instancia única.
     * 
     * @return la instancia única.
     */
    public static GestorConfiguracionAvanzado obtenerInstancia() {
        return Holder.INSTANCIA;
    }

    /**
     * Obtiene un valor de configuración por su clave.
     * 
     * @param clave la clave de la configuración.
     * @return el valor asociado o null si no existe.
     */
    public String obtenerConfiguracion(String clave) {
        return configuraciones.get(clave);
    }
}
