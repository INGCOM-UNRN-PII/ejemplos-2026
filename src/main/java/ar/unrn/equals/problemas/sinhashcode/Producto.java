package ar.unrn.equals.problemas.sinhashcode;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete demuestra por que redefinir equals sin redefinir hashCode genera resultados inconsistentes en sets y mapas.
 */
@SuppressWarnings("EqualsHashCode")
public class Producto {
    private String codigo;

    public Producto(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Producto p)) {
            return false;
        }
        return codigo.equals(p.codigo);
    }
}
