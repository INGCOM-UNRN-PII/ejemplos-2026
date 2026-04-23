package ar.unrn.generados.objetos.internas;
public class Interna {
    private final String nombreExterno;
    public Interna(String nombreExterno) { this.nombreExterno = nombreExterno; }
    public void mostrar() {
        System.out.println("Desde Interna: " + nombreExterno);
    }
}
