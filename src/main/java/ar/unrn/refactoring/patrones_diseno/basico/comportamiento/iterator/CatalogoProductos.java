package ar.unrn.refactoring.patrones_diseno.basico.comportamiento.iterator;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el catalogo expone su arreglo interno para que otros lo recorran.
 */
public class CatalogoProductos {
    private final String[] nombres = {"mesa", "silla", "lampara"};

    public String[] nombres() {
        return nombres;
    }
}

class PantallaCatalogo {
    public void mostrar(CatalogoProductos catalogo) {
        String[] nombres = catalogo.nombres();
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
