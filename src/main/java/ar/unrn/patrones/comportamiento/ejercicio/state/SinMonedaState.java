package ar.unrn.patrones.comportamiento.ejercicio.state;

/**
 * Encapsula lo que la maquina puede hacer mientras todavia no recibio dinero y evita que esas reglas queden dispersas en ifs.
 * El paquete implementa una maquina expendedora con State para mover las reglas de cada situacion a objetos de estado independientes.
 */
public class SinMonedaState implements EstadoMaquina {
    private MaquinaExpendedora maquina;

    public SinMonedaState(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda(int cantidad) {
        // TODO: Si la cantidad es igual o mayor al precio de la bebida, 
        // aceptar la moneda y cambiar al estado ConMonedaState.
        // Si no, rechazarla (mensaje por consola).
    }

    @Override
    public void expulsarMoneda() {
        // TODO: Mostrar mensaje de que no hay moneda insertada.
    }

    @Override
    public void solicitarBebida() {
        // TODO: Mostrar mensaje pidiendo que se inserte moneda primero.
    }
}
