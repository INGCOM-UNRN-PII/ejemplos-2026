package ar.unrn.solid.isp;

/**
 * VIOLACIÓN ISP: Una interfaz con demasiadas responsabilidades.
 * Un 'Robot' se ve obligado a implementar 'comer' y 'dormir'.
 */
interface TrabajadorMal {
    void trabajar();
    void comer();
    void dormir();
}

class HumanoMal implements TrabajadorMal {
    @Override
    public void trabajar() { System.out.println("Humano trabajando"); }
    @Override
    public void comer() { System.out.println("Humano comiendo"); }
    @Override
    public void dormir() { System.out.println("Humano durmiendo"); }
}

class RobotMal implements TrabajadorMal {
    @Override
    public void trabajar() { System.out.println("Robot trabajando"); }
    @Override
    public void comer() { /* El robot no come, pero debe implementar el método */ }
    @Override
    public void dormir() { /* El robot no duerme */ }
}
