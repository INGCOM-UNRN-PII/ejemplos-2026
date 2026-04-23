package ar.unrn.equals.problemas.sinhashcode;
@SuppressWarnings("EqualsHashCode")
public class Producto {
    private String codigo;
    public Producto(String codigo) { this.codigo = codigo; }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Producto p)) return false;
        return codigo.equals(p.codigo);
    }
}
