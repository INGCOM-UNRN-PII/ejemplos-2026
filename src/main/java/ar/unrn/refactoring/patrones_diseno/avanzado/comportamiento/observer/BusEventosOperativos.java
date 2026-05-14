package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.observer;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el bus avisa manualmente a multiples consumidores conocidos.
 */
public class BusEventosOperativos {
    private final ProyeccionDashboard dashboard = new ProyeccionDashboard();
    private final PersistenciaAuditoria auditoria = new PersistenciaAuditoria();
    private final NotificadorIncidentes incidentes = new NotificadorIncidentes();

    public void publicar(String evento) {
        dashboard.actualizar(evento);
        auditoria.registrar(evento);
        incidentes.notificar(evento);
    }
}

class ProyeccionDashboard { public void actualizar(String evento) { System.out.println("Dashboard " + evento); } }
class PersistenciaAuditoria { public void registrar(String evento) { System.out.println("Auditoria " + evento); } }
class NotificadorIncidentes { public void notificar(String evento) { System.out.println("Incidente " + evento); } }
