package ar.unrn.patrones.estructurales.decorator;

public class CajaObtenibleAdaptador implements Obtenible{
    private final Encajable caja;

    public CajaObtenibleAdaptador(Encajable caja) {
        this.caja = caja;
    }

    @Override
    public int recuperar() {
        System.out.println("Adaptando!!!!!");
        return caja.obtener();
    }

}
