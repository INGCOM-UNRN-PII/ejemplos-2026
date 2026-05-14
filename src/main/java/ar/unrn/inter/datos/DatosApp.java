package ar.unrn.inter.datos;

/**
 * Demuestra interdependencia por datos.
 */
public class DatosApp {

    /**
     * Ejecuta el ejemplo.
     *
     * @param args argumentos no utilizados.
     */
    public static void main(String[] args) {
        Pedido pedido = new Pedido("P-200", 12, 18.5);
        CalculadoraEnvio calculadora = new CalculadoraEnvio();

        double costo = calculadora.costo(pedido.peso(), pedido.distanciaKm());
        System.out.println("Costo de envio: " + costo);
    }
}

final class CalculadoraEnvio {
    double costo(double peso, double distanciaKm) {
        return (peso * 4) + (distanciaKm * 1.5);
    }
}

record Pedido(String codigo, double peso, double distanciaKm) {
}
