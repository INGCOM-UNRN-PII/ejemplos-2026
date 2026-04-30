package ar.unrn.equals.problemas.rendimiento;

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
