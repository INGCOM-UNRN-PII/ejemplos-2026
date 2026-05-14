    package ar.unrn.refactoring.enunciados.intermedio.composicion_de_funciones.split_phase;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ProcesadorReservas {
    public String procesar(String entrada) {
        String[] partes = entrada.split(",");
        if (partes.length < 2) {
            throw new IllegalArgumentException("Entrada invalida");
        }
        int cantidad = Integer.parseInt(partes[0]);
        double precio = Double.parseDouble(partes[1]);
        return "TOTAL=" + (cantidad * precio);
    }
}
