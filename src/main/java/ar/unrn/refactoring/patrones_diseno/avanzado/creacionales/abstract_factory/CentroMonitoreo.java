package ar.unrn.refactoring.patrones_diseno.avanzado.creacionales.abstract_factory;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el centro de monitoreo crea familias enteras de componentes con if anidados.
 */
public class CentroMonitoreo {
    public String iniciar(String plataforma) {
        Dashboard dashboard;
        Alerta alerta;
        Bitacora bitacora;
        if ("nube".equals(plataforma)) {
            dashboard = new DashboardNube();
            alerta = new AlertaNube();
            bitacora = new BitacoraNube();
        } else {
            dashboard = new DashboardOnPremise();
            alerta = new AlertaOnPremise();
            bitacora = new BitacoraOnPremise();
        }
        return dashboard.nombre() + " / " + alerta.tipo() + " / " + bitacora.formato();
    }
}

interface Dashboard { String nombre(); }
interface Alerta { String tipo(); }
interface Bitacora { String formato(); }
class DashboardNube implements Dashboard { @Override public String nombre() { return "dashboard nube"; } }
class DashboardOnPremise implements Dashboard { @Override public String nombre() { return "dashboard on-premise"; } }
class AlertaNube implements Alerta { @Override public String tipo() { return "alerta nube"; } }
class AlertaOnPremise implements Alerta { @Override public String tipo() { return "alerta on-premise"; } }
class BitacoraNube implements Bitacora { @Override public String formato() { return "json"; } }
class BitacoraOnPremise implements Bitacora { @Override public String formato() { return "texto"; } }
