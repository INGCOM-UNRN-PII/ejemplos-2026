package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.command;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el panel administra acciones con un switch centralizado.
 */
public class PanelAdministrador {
    public void ejecutar(String accion, Documento documento) {
        switch (accion) {
            case "guardar" -> {
                documento.guardar();
            }
            case "publicar" -> {
                documento.publicar();
            }
            default -> throw new IllegalArgumentException("Accion desconocida");
        }
    }
}

class Documento {
    public void guardar() { System.out.println("Guardado"); }
    public void publicar() { System.out.println("Publicado"); }
}
