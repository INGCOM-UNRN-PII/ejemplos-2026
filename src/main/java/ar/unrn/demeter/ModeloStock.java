package ar.unrn.demeter;

final class Producto {
    private final String nombre;
    private final Deposito deposito;

    Producto(String nombre, Deposito deposito) {
        this.nombre = nombre;
        this.deposito = deposito;
    }

    String nombre() {
        return nombre;
    }

    Deposito deposito() {
        return deposito;
    }

    boolean hayStockDisponible(int cantidad) {
        return deposito.stockActual() >= cantidad;
    }

    String ubicacionPreferida() {
        return deposito.ubicacion().codigo();
    }
}

final class Deposito {
    private final Ubicacion ubicacion;
    private final int stockActual;

    Deposito(Ubicacion ubicacion, int stockActual) {
        this.ubicacion = ubicacion;
        this.stockActual = stockActual;
    }

    Ubicacion ubicacion() {
        return ubicacion;
    }

    int stockActual() {
        return stockActual;
    }
}

final class Ubicacion {
    private final String codigo;

    Ubicacion(String codigo) {
        this.codigo = codigo;
    }

    String codigo() {
        return codigo;
    }
}
