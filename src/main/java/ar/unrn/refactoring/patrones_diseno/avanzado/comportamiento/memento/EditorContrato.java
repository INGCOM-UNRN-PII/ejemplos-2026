package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.memento;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde un editor guarda backups con variables sueltas.
 */
public class EditorContrato {
    private String titulo = "Borrador";
    private String cuerpo = "Texto inicial";

    public Respaldo crearRespaldo() {
        return new Respaldo(titulo, cuerpo);
    }

    public void restaurar(Respaldo respaldo) {
        this.titulo = respaldo.titulo();
        this.cuerpo = respaldo.cuerpo();
    }

    public void editar(String nuevoTitulo, String nuevoCuerpo) {
        this.titulo = nuevoTitulo;
        this.cuerpo = nuevoCuerpo;
    }
}

record Respaldo(String titulo, String cuerpo) { }
