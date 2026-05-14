    package ar.unrn.refactoring.enunciados.avanzado.generalizacion_y_jerarquias.pull_up_method;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CuentaBase {
}

class ResumenClinico extends CuentaBase {
    public String descripcion() {
        return "COD-" + 10;
    }
}

class LiquidacionClinica extends CuentaBase {
    public String descripcion() {
        return "COD-" + 10;
    }
}
