    package ar.unrn.refactoring.enunciados.avanzado.simplificacion_de_llamadas.return_modified_value;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class AplicadorCopago {
    public void aplicar(CuentaClinica dato) {
        dato.aplicar(0.1);
    }
}

class CuentaClinica {
    private double total = 1000;

    public void aplicar(double factor) {
        total = total - (total * factor);
    }

    public double total() {
        return total;
    }
}
