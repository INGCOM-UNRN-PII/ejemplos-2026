package ar.unrn.patrones.estructurales.decorator;

public class Caja implements Encajable {

    private int valor;

    public Caja(int valor) {
        this.valor = valor;
    }

    @Override
    public int obtener() {
        return valor;
    }
}
