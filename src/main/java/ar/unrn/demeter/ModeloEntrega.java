package ar.unrn.demeter;

final class Cliente {
    private final String nombre;
    private final Direccion direccion;

    Cliente(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    String nombre() {
        return nombre;
    }

    Direccion direccion() {
        return direccion;
    }

    String ciudadDeEntrega() {
        return direccion.ciudad();
    }

    String codigoPostal() {
        return direccion.codigoPostal().valor();
    }

    boolean viveEnPatagonia() {
        return direccion.ciudad().equals("Neuquen")
                || direccion.ciudad().equals("Bariloche")
                || direccion.ciudad().equals("Comodoro Rivadavia");
    }
}

final class Direccion {
    private final String ciudad;
    private final CodigoPostal codigoPostal;

    Direccion(String ciudad, CodigoPostal codigoPostal) {
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    String ciudad() {
        return ciudad;
    }

    CodigoPostal codigoPostal() {
        return codigoPostal;
    }
}

final class CodigoPostal {
    private final String valor;

    CodigoPostal(String valor) {
        this.valor = valor;
    }

    String valor() {
        return valor;
    }
}
