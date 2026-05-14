package ar.unrn.refactoring.patrones_diseno.intermedio.comportamiento.template_method;

import java.util.Locale;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde dos importadores repiten la misma secuencia de pasos.
 */
public class ImportadorReportes {
}

class ImportadorCsv {
    public String importar(String archivo) {
        validar(archivo);
        String contenido = abrir(archivo);
        String datos = parsear(contenido);
        return guardar(datos);
    }

    private void validar(String archivo) { System.out.println("Validando CSV " + archivo); }
    private String abrir(String archivo) { return "csv:" + archivo; }
    private String parsear(String contenido) { return contenido.toUpperCase(Locale.ROOT); }
    private String guardar(String datos) { return "CSV:" + datos; }
}

class ImportadorXml {
    public String importar(String archivo) {
        validar(archivo);
        String contenido = abrir(archivo);
        String datos = parsear(contenido);
        return guardar(datos);
    }

    private void validar(String archivo) { System.out.println("Validando XML " + archivo); }
    private String abrir(String archivo) { return "xml:" + archivo; }
    private String parsear(String contenido) { return contenido.toLowerCase(Locale.ROOT); }
    private String guardar(String datos) { return "XML:" + datos; }
}
