    package ar.unrn.refactoring.enunciados.avanzado.organizacion_de_datos.replace_type_code_with_subclasses;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Paciente {
    public static final int NORMAL = 1;
    public static final int ESPECIAL = 2;

    private int tipo;
    private double base;

    public double total() {
        if (tipo == NORMAL) {
            return base;
        }
        return base * 0.8;
    }
}
