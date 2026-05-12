package ar.unrn.patrones.comportamiento.ejercicio.state;

public interface EstadoMaquina {
    void insertarMoneda(int cantidad);
    void expulsarMoneda();
    void solicitarBebida();
}
