    package ar.unrn.refactoring.enunciados.intermedio.simplificacion_de_condicionales.introduce_assertion;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraEstadia {
    public double valor(BloqueReserva dato) {
        return dato.cantidad() / dato.unidades();
    }
}

record BloqueReserva(double cantidad, double unidades) {
}
