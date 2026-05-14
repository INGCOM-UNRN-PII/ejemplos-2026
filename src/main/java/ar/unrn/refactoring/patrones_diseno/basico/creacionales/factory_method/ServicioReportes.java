package ar.unrn.refactoring.patrones_diseno.basico.creacionales.factory_method;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde un servicio decide con if que exportador concreto instanciar.
 */
public class ServicioReportes {
    public String exportar(String formato, String contenido) {
        Exportador exportador;
        if ("pdf".equals(formato)) {
            exportador = new ExportadorPdf();
        } else {
            exportador = new ExportadorCsv();
        }
        return exportador.exportar(contenido);
    }
}

interface Exportador {
    String exportar(String contenido);
}

class ExportadorPdf implements Exportador {
    @Override
    public String exportar(String contenido) {
        return "PDF:" + contenido;
    }
}

class ExportadorCsv implements Exportador {
    @Override
    public String exportar(String contenido) {
        return "CSV:" + contenido;
    }
}
