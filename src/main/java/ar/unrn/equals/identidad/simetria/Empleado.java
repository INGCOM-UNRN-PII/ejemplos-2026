package ar.unrn.equals.identidad.simetria;
public class Empleado extends Persona {
    private final int legajo;
    public Empleado(String nombre, int legajo) { super(nombre); this.legajo = legajo; }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Empleado)) return false;
        Empleado otro = (Empleado) obj;
        return nombre.equals(otro.nombre) && legajo == otro.legajo;
    }
    @Override public int hashCode() { return 31 * nombre.hashCode() + legajo; }
}
