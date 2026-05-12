package ar.unrn.patrones.comportamiento.ejercicio.state;

public class AgotadoState implements EstadoMaquina {
    private MaquinaExpendedora maquina;

    public AgotadoState(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda(int cantidad) {
        // TODO: Mostrar mensaje indicando que no hay stock y devolver la moneda.
    }

    @Override
    public void expulsarMoneda() {
        // TODO: Mostrar mensaje de que no se puede expulsar nada.
    }

    @Override
    public void solicitarBebida() {
        // TODO: Mostrar mensaje de que no hay stock.
    }
}
