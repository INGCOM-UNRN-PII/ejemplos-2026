package ar.unrn.solid.isp;

/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete usa estos tipos para mostrar que una interfaz debe exponer solo las operaciones que cada cliente realmente necesita.
 */
interface TrabajadorMal {
    void trabajar();

    void comer();

    void dormir();
}

/**
 * Representa una variante deliberadamente defectuosa que sirve para exponer el problema de diseno que el paquete esta discutiendo.
 * El paquete usa estos tipos para mostrar que una interfaz debe exponer solo las operaciones que cada cliente realmente necesita.
 */
class HumanoMal implements TrabajadorMal {
    @Override
    public void trabajar() {
        System.out.println("Humano trabajando");
    }

    @Override
    public void comer() {
        System.out.println("Humano comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("Humano durmiendo");
    }
}

/**
 * Representa una variante deliberadamente defectuosa que sirve para exponer el problema de diseno que el paquete esta discutiendo.
 * El paquete usa estos tipos para mostrar que una interfaz debe exponer solo las operaciones que cada cliente realmente necesita.
 */
class RobotMal implements TrabajadorMal {
    @Override
    public void trabajar() {
        System.out.println("Robot trabajando");
    }

    @Override
    public void comer() { /* El robot no come, pero debe implementar el método */ }

    @Override
    public void dormir() { /* El robot no duerme */ }
}
