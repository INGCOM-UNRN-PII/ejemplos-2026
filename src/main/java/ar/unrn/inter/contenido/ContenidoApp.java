package ar.unrn.inter.contenido;

import java.util.ArrayList;
import java.util.List;

/**
 * Demuestra interdependencia por contenido.
 */
public class ContenidoApp {

    /**
     * Ejecuta el ejemplo.
     *
     * @param args argumentos no utilizados.
     */
    public static void main(String[] args) {
        CuentaInterna cuenta = new CuentaInterna();
        CierreForzado cierre = new CierreForzado();

        System.out.println("Antes: " + cuenta.estado());
        cierre.aplicar(cuenta);
        System.out.println("Despues: " + cuenta.estado());
    }
}

final class CierreForzado {
    void aplicar(CuentaInterna cuenta) {
        cuenta.saldo = 0;
        cuenta.bloqueada = true;
        cuenta.movimientos.clear();
        cuenta.movimientos.add("CIERRE FORZADO");
    }
}

final class CuentaInterna {
    double saldo = 1200;
    boolean bloqueada = false;
    List<String> movimientos = new ArrayList<>();

    CuentaInterna() {
        movimientos.add("ALTA");
        movimientos.add("PAGO INICIAL");
    }

    String estado() {
        return "saldo=" + saldo + ", bloqueada=" + bloqueada + ", movimientos=" + movimientos;
    }
}
