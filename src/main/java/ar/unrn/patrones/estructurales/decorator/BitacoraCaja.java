package ar.unrn.patrones.estructurales.decorator;

public class BitacoraCaja implements Encajable {
    private Encajable caja;

    public BitacoraCaja(Encajable caja) {
        this.caja = caja;
    }

    @Override
    public int obtener() {
        System.out.println("Obteniendo valor...");
        int retorno = caja.obtener();
        System.out.println("Obtenido " + retorno);
        return retorno;
    }

}
