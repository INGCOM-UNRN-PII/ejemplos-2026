package ar.unrn.solid.lsp;

public class Cuadrado implements FiguraLSP {
    private final int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public int obtenerArea() {
        return lado * lado;
    }
}
