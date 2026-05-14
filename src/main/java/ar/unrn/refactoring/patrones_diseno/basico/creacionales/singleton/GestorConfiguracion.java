package ar.unrn.refactoring.patrones_diseno.basico.creacionales.singleton;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde varias partes del sistema crean su propio gestor de configuracion en lugar de compartir uno solo.
 */
public class GestorConfiguracion {
    private String entorno = "produccion";

    public String entorno() {
        return entorno;
    }

    public void cambiarEntorno(String nuevoEntorno) {
        this.entorno = nuevoEntorno;
    }
}

class InicioAplicacion {
    public GestorConfiguracion crearGestor() {
        return new GestorConfiguracion();
    }
}

class PanelOperador {
    public GestorConfiguracion crearGestor() {
        return new GestorConfiguracion();
    }
}
