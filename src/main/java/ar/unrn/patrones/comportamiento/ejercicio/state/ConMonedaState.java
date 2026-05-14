package ar.unrn.patrones.comportamiento.ejercicio.state;

/**
 * Encapsula las reglas aplicables despues de insertar dinero, incluyendo la validacion de compra o devolucion.
 * El paquete implementa una maquina expendedora con State para mover las reglas de cada situacion a objetos de estado independientes.
 */
public class ConMonedaState implements EstadoMaquina {
    private final MaquinaExpendedora maquina;

    public ConMonedaState(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda(int cantidad) {
        System.out.println("Ya has insertado una moneda. Espera tu bebida.");
    }

    @Override
    public void expulsarMoneda() {
        System.out.println("Devolviendo moneda...");
        maquina.setEstado(maquina.getSinMonedaState());
    }

    @Override
    public void solicitarBebida() {
        System.out.println("Entregando bebida...");
        maquina.reducirStock();

        if (maquina.getStock() > 0) {
            maquina.setEstado(maquina.getSinMonedaState());
            return;
        }
        System.out.println("¡Oops! Fue la última bebida.");
        maquina.setEstado(maquina.getAgotadoState());
    }
}
