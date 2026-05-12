package ar.unrn.patrones.comportamiento.ejercicio.state;

/**
 * Representa el estado sin stock y concentra las respuestas que la maquina debe dar cuando ya no puede dispensar productos.
 * El paquete implementa una maquina expendedora con State para mover las reglas de cada situacion a objetos de estado independientes.
 */
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
