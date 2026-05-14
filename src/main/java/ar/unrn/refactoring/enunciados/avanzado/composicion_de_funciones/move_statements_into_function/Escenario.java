    package ar.unrn.refactoring.enunciados.avanzado.composicion_de_funciones.move_statements_into_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class GestorAdmisiones {
    private final CalculadoraInternacion calculadora = new CalculadoraInternacion();

    public double totalComun(Solicitud dato) {
        validar(dato);
        return calculadora.total(dato);
    }

    public double totalConPromocion(Solicitud dato) {
        validar(dato);
        return calculadora.total(dato) * 0.9;
    }

    private void validar(Solicitud dato) {
        if (dato.cantidad() <= 0) {
            throw new IllegalArgumentException("Cantidad invalida");
        }
    }
}

class CalculadoraInternacion {
    public double total(Solicitud dato) {
        return dato.cantidad() * dato.precioUnitario();
    }
}

record Solicitud(int cantidad, double precioUnitario) {
}
