package ar.unrn.patrones.comportamiento.ejercicio.state;

public class MaquinaExpendedora {
    private EstadoMaquina sinMonedaState;
    private EstadoMaquina conMonedaState;
    private EstadoMaquina agotadoState;

    private EstadoMaquina estadoActual;
    private int stock = 0;
    private static final int PRECIO_BEBIDA = 10;

    public MaquinaExpendedora(int stockInicial) {
        this.sinMonedaState = new SinMonedaState(this);
        this.conMonedaState = new ConMonedaState(this);
        this.agotadoState = new AgotadoState(this);

        this.stock = stockInicial;
        if (stockInicial > 0) {
            this.estadoActual = sinMonedaState;
        } else {
            this.estadoActual = agotadoState;
        }
    }

    public void insertarMoneda(int cantidad) {
        estadoActual.insertarMoneda(cantidad);
    }

    public void expulsarMoneda() {
        estadoActual.expulsarMoneda();
    }

    public void solicitarBebida() {
        estadoActual.solicitarBebida();
    }

    // --- Getters y Setters para uso de los Estados ---

    public void setEstado(EstadoMaquina estado) {
        this.estadoActual = estado;
    }

    public EstadoMaquina getSinMonedaState() {
        return sinMonedaState;
    }

    public EstadoMaquina getConMonedaState() {
        return conMonedaState;
    }

    public EstadoMaquina getAgotadoState() {
        return agotadoState;
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock() {
        if (stock > 0) {
            stock--;
        }
    }

    public int getPrecioBebida() {
        return PRECIO_BEBIDA;
    }
}
