package ar.unrn.patrones.comportamiento.ejercicio.state;

/**
 * Representa el estado sin stock y concentra las respuestas que la maquina debe dar cuando ya no puede dispensar productos.
 * El paquete implementa una maquina expendedora con State para mover las reglas de cada situacion a objetos de estado independientes.
 */
public class AgotadoState implements EstadoMaquina {
    private final MaquinaExpendedora maquina;

    public AgotadoState(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda(int cantidad) {
        System.out.println("Máquina sin stock. Devolviendo moneda de $" + cantidad);
    }

    @Override
    public void expulsarMoneda() {
        System.out.println("No has insertado moneda para expulsar.");
    }

    @Override
    public void solicitarBebida() {
        System.out.println("Lo sentimos, no hay stock.");
    }
}
