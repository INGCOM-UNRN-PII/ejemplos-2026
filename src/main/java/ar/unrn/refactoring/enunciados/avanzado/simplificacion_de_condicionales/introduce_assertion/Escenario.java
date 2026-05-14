    package ar.unrn.refactoring.enunciados.avanzado.simplificacion_de_condicionales.introduce_assertion;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraDosis {
    public double valor(AplicacionMedicamento dato) {
        return dato.cantidad() / dato.unidades();
    }
}

record AplicacionMedicamento(double cantidad, double unidades) {
}
