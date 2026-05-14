    package ar.unrn.refactoring.enunciados.basico.generalizacion_y_jerarquias.pull_up_method;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class DocumentoBase {
}

class FacturaPedido extends DocumentoBase {
    public String descripcion() {
        return "COD-" + 10;
    }
}

class FacturaServicio extends DocumentoBase {
    public String descripcion() {
        return "COD-" + 10;
    }
}
