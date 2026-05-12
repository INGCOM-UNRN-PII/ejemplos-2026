package ar.unrn.patrones.estructurales.decorator;

public class CajaApp {

    static void main() {
        Encajable original = new Caja(10);

        Encajable decorado = new BitacoraCaja(original);

        Obtenible obtunido = new CajaObtenibleAdaptador(decorado);
        System.out.println(original.obtener());
        System.out.println(decorado.obtener());

        System.out.println(obtunido.recuperar());
    }
}
