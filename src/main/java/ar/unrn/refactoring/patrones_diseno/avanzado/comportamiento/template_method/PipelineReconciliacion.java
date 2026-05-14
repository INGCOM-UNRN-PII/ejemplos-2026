package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.template_method;

import java.util.Locale;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde dos reconciliadores repiten el mismo flujo con leves variaciones.
 */
public class PipelineReconciliacion {
}

class ReconciliadorBanco {
    public String reconciliar(String archivo) {
        validar(archivo);
        String bruto = cargar(archivo);
        String normalizado = transformar(bruto);
        return persistir(normalizado);
    }

    private void validar(String archivo) { System.out.println("Validando banco " + archivo); }
    private String cargar(String archivo) { return "BANCO:" + archivo; }
    private String transformar(String contenido) { return contenido.toUpperCase(Locale.ROOT); }
    private String persistir(String contenido) { return "PERSISTE_BANCO:" + contenido; }
}

class ReconciliadorTarjetas {
    public String reconciliar(String archivo) {
        validar(archivo);
        String bruto = cargar(archivo);
        String normalizado = transformar(bruto);
        return persistir(normalizado);
    }

    private void validar(String archivo) { System.out.println("Validando tarjetas " + archivo); }
    private String cargar(String archivo) { return "TARJETA:" + archivo; }
    private String transformar(String contenido) { return contenido.toLowerCase(Locale.ROOT); }
    private String persistir(String contenido) { return "PERSISTE_TARJETA:" + contenido; }
}
