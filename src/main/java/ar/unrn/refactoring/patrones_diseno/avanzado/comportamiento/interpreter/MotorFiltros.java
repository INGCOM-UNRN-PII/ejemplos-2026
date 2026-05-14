package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.interpreter;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde un motor interpreta reglas con strings y condiciones anidadas.
 */
public class MotorFiltros {
    public boolean evaluar(String regla, Contexto contexto) {
        if ("ACTIVO_Y_MAYOR".equals(regla)) {
            return contexto.activo() && contexto.edad() >= 18;
        }
        if ("MOROSO_O_BLOQUEADO".equals(regla)) {
            return contexto.moroso() || contexto.bloqueado();
        }
        throw new IllegalArgumentException("Regla desconocida");
    }
}

record Contexto(boolean activo, int edad, boolean moroso, boolean bloqueado) { }
