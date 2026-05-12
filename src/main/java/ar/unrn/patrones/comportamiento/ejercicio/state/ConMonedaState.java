package ar.unrn.patrones.comportamiento.ejercicio.state;

/**
 * Encapsula las reglas aplicables despues de insertar dinero, incluyendo la validacion de compra o devolucion.
 * El paquete implementa una maquina expendedora con State para mover las reglas de cada situacion a objetos de estado independientes.
 */
public class ConMonedaState implements EstadoMaquina {
    private MaquinaExpendedora maquina;

    public ConMonedaState(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda(int cantidad) {
        // TODO: Mostrar mensaje indicando que ya hay una moneda.
    }

    @Override
    public void expulsarMoneda() {
        // TODO: Mostrar mensaje de devolución y volver a SinMonedaState.
    }

    @Override
    public void solicitarBebida() {
        // TODO: 
        // 1. Mostrar mensaje entregando la bebida.
        // 2. Reducir el stock de la máquina.
        // 3. Verificar el nuevo stock:
        //    - Si stock > 0, pasar a SinMonedaState.
        //    - Si stock == 0, pasar a AgotadoState.
    }
}
