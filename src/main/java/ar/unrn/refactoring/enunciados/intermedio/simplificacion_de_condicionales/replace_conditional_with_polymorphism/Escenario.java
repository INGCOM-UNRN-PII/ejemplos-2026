    package ar.unrn.refactoring.enunciados.intermedio.simplificacion_de_condicionales.replace_conditional_with_polymorphism;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraTarifa {
    public double total(Reserva dato) {
        switch (dato.tipo()) {
            case "NORMAL":
                return dato.base();
            case "PREMIUM":
                return dato.base() * 0.8;
            default:
                return dato.base() * 1.1;
        }
    }
}

record Reserva(String tipo, double base) {
}
