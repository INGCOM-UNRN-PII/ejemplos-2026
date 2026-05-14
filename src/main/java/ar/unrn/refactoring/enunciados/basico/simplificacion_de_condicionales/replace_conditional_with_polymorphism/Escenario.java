    package ar.unrn.refactoring.enunciados.basico.simplificacion_de_condicionales.replace_conditional_with_polymorphism;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraEnvio {
    public double total(Pedido dato) {
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

record Pedido(String tipo, double base) {
}
