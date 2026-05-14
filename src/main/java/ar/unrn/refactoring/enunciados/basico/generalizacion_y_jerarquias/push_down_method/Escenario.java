    package ar.unrn.refactoring.enunciados.basico.generalizacion_y_jerarquias.push_down_method;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Empleado {
    public double beneficioEspecial() {
        return 0;
    }
}

class Vendedor extends Empleado {
}

class Analista extends Empleado {
}
