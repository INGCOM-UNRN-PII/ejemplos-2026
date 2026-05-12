package ar.unrn.codesmells.oo_abusers;

/**
 * Representa una pieza del ejemplo donde la orientacion a objetos se usa de forma poco expresiva y termina escondiendo el problema real.
 * El paquete muestra abusos de orientacion a objetos donde la jerarquia o la abstraccion terminan escondiendo un diseño poco expresivo.
 */
public class OOAbusers {

    /**
     * Calcula la comisión basada en el tipo de venta (Switch Statement).
     *
     * @param tipo  categoría de la venta.
     * @param venta importe de la venta.
     *
     * @return comisión calculada.
     */
    public double calcularComision(String tipo, double venta) {
        switch (tipo) {
            case "ORO":
                return venta * 0.1;
            case "PLATA":
                return venta * 0.05;
            default:
                return 0;
        }
    }
}

/**
 * Representa una pieza del ejemplo donde la orientacion a objetos se usa de forma poco expresiva y termina escondiendo el problema real.
 * El paquete muestra abusos de orientacion a objetos donde la jerarquia o la abstraccion terminan escondiendo un diseño poco expresivo.
 */
class Pajaro {
    /**
     * Realiza la acción de volar.
     */
    public void volar() {
        System.out.println("Volando...");
    }
}

/**
 * Representa una pieza del ejemplo donde la orientacion a objetos se usa de forma poco expresiva y termina escondiendo el problema real.
 * El paquete muestra abusos de orientacion a objetos donde la jerarquia o la abstraccion terminan escondiendo un diseño poco expresivo.
 */
class Avestruz extends Pajaro {
    /**
     * Las avestruces no vuelan.
     *
     * @throws UnsupportedOperationException siempre.
     */
    @Override
    public void volar() {
        throw new UnsupportedOperationException("Las avestruces no vuelan");
    }
}

/**
 * Representa una pieza del ejemplo donde la orientacion a objetos se usa de forma poco expresiva y termina escondiendo el problema real.
 * El paquete muestra abusos de orientacion a objetos donde la jerarquia o la abstraccion terminan escondiendo un diseño poco expresivo.
 */
class LectorJson {
    /**
     * @param p ruta del archivo.
     */
    public void leerArchivo(String p) {
    }
}

/**
 * Representa una pieza del ejemplo donde la orientacion a objetos se usa de forma poco expresiva y termina escondiendo el problema real.
 * El paquete muestra abusos de orientacion a objetos donde la jerarquia o la abstraccion terminan escondiendo un diseño poco expresivo.
 */
class XmlParser {
    /**
     * @param f archivo XML.
     */
    public void parsearDocumento(String f) {
    }
}

/**
 * Representa una pieza del ejemplo donde la orientacion a objetos se usa de forma poco expresiva y termina escondiendo el problema real.
 * El paquete muestra abusos de orientacion a objetos donde la jerarquia o la abstraccion terminan escondiendo un diseño poco expresivo.
 */
class ProcesadorCalculo {
    private double resultadoTemporal; // Solo tiene valor mientras corre calcular()

    /**
     * Realiza un cálculo y muestra el resultado.
     *
     * @param a primer valor.
     * @param b segundo valor.
     */
    public void calcular(double a, double b) {
        resultadoTemporal = a * b;
        System.out.println(resultadoTemporal);
    }
}
