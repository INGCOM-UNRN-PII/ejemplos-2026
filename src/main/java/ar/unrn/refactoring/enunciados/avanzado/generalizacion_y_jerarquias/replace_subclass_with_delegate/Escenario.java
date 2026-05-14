    package ar.unrn.refactoring.enunciados.avanzado.generalizacion_y_jerarquias.replace_subclass_with_delegate;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CuentaClinica {
    public double total() {
        return 1000;
    }
}

class CuentaConPlan extends CuentaClinica {
    @Override
    public double total() {
        return super.total() * 0.8;
    }
}
