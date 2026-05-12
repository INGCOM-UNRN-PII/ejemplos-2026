package ar.unrn.patrones.comportamiento.ejercicio.state;

/**
 * Define el contrato comun de los estados para que la maquina delegue comportamiento sin llenarse de condicionales.
 * El paquete implementa una maquina expendedora con State para mover las reglas de cada situacion a objetos de estado independientes.
 */
public interface EstadoMaquina {
    void insertarMoneda(int cantidad);
    void expulsarMoneda();
    void solicitarBebida();
}
