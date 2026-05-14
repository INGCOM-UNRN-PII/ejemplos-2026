    package ar.unrn.refactoring.enunciados.basico.simplificacion_de_condicionales.introduce_assertion;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraVelocidad {
    public double valor(Tramo dato) {
        return dato.cantidad() / dato.unidades();
    }
}

record Tramo(double cantidad, double unidades) {
}
