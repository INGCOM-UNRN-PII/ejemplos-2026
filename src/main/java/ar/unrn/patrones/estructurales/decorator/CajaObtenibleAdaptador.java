package ar.unrn.patrones.estructurales.decorator;

import java.math.BigInteger;

public class CajaObtenibleAdaptador implements Obtenible {
    private final Encajable caja;

    public CajaObtenibleAdaptador(Encajable caja) {
        this.caja = caja;
    }

    @Override
    public BigInteger recuperar() {
        System.out.println("Adaptando!!!!!");
        return new BigInteger(String.valueOf(caja.obtener()));
    }

}
