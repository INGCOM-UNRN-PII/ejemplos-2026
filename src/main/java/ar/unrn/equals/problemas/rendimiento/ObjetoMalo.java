package ar.unrn.equals.problemas.rendimiento;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete compara objetos con estrategias de hash distintas para conectar la calidad del hash con el costo de busqueda.
 */
public class ObjetoMalo {
    private final int id;

    public ObjetoMalo(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ObjetoMalo that)) {
            return false;
        }
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return 42;
    }
}
