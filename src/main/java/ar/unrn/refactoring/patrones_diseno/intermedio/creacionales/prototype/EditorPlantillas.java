package ar.unrn.refactoring.patrones_diseno.intermedio.creacionales.prototype;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde se duplican plantillas copiando campo por campo.
 */
public class EditorPlantillas {
    public Documento crearDesdeBase(Documento base) {
        Documento copia = new Documento();
        copia.titulo = base.titulo;
        copia.cuerpo = base.cuerpo;
        copia.autor = base.autor;
        return copia;
    }
}

class Documento {
    String titulo = "";
    String cuerpo = "";
    String autor = "";
}
