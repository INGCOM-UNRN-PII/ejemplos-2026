    package ar.unrn.refactoring.enunciados.avanzado.simplificacion_de_llamadas.replace_parameter_with_query;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraInternacion {
    public double totalConDescuento(CuentaClinica dato, Paciente titular) {
        return dato.base() * titular.factor();
    }
}

class CuentaClinica {
    private Paciente titular;
    private double base;

    public Paciente titular() {
        return titular;
    }

    public double base() {
        return base;
    }
}

class Paciente {
    public double factor() {
        return 0.9;
    }
}
