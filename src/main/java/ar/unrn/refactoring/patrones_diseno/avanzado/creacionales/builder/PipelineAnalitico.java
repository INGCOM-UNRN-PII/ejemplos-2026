package ar.unrn.refactoring.patrones_diseno.avanzado.creacionales.builder;

import java.util.List;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde un pipeline se arma con un constructor largo y dificil de leer.
 */
public class PipelineAnalitico {
    private final String fuente;
    private final String destino;
    private final boolean auditado;
    private final boolean compresion;
    private final int reintentos;
    private final List<String> transformaciones;

    public PipelineAnalitico(String fuente, String destino, boolean auditado, boolean compresion,
            int reintentos, List<String> transformaciones) {
        this.fuente = fuente;
        this.destino = destino;
        this.auditado = auditado;
        this.compresion = compresion;
        this.reintentos = reintentos;
        this.transformaciones = transformaciones;
    }

    public String resumen() {
        return fuente + " -> " + destino + " / " + auditado + " / " + compresion + " / "
                + reintentos + " / " + transformaciones.size();
    }
}
