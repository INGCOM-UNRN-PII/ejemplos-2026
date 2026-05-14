package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.state;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el despliegue decide acciones con strings de estado.
 */
public class OrquestadorDespliegue {
    private String estado = "pendiente";

    public String ejecutar() {
        if ("pendiente".equals(estado)) {
            estado = "ejecutando";
            return "Inicio despliegue";
        }
        if ("ejecutando".equals(estado)) {
            estado = "verificando";
            return "Verificando";
        }
        if ("verificando".equals(estado)) {
            estado = "completado";
            return "Completado";
        }
        return "Sin cambios";
    }
}
