package ar.unrn.patrones.comportamiento.ejercicio.state;

/**
 * Encapsula lo que la maquina puede hacer mientras todavia no recibio dinero y evita que esas reglas queden dispersas en ifs.
 * El paquete implementa una maquina expendedora con State para mover las reglas de cada situacion a objetos de estado independientes.
 */
public class SinMonedaState implements EstadoMaquina {
    private final MaquinaExpendedora maquina;

    public SinMonedaState(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda(int cantidad) {
        if (cantidad >= maquina.getPrecioBebida()) {
            System.out.println("Moneda de $" + cantidad + " aceptada.");
            maquina.setEstado(maquina.getConMonedaState());
            return;
        }
        System.out.println("Moneda rechazada. El precio es $" + maquina.getPrecioBebida());
    }

    @Override
    public void expulsarMoneda() {
        System.out.println("No has insertado ninguna moneda.");
    }

    @Override
    public void solicitarBebida() {
        System.out.println("Primero debes insertar una moneda.");
    }
}
