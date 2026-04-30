package ar.unrn.smells.fragilidad;

/**
 * Ejemplo 1: Efectos secundarios por estado global/estático compartido.
 */
class ConfiguracionGlobal {
    public static int TIMEOUT = 5000;
}

class ModuloA {
    public void ejecutar() {
        ConfiguracionGlobal.TIMEOUT = 10; // Cambio temporal que rompe ModuloB
    }
}

class ModuloB {
    public void procesar() {
        if (ConfiguracionGlobal.TIMEOUT < 1000) {
            throw new RuntimeException("Error: Tiempo insuficiente provocado por ModuloA");
        }
    }
}

/**
 * Ejemplo 2: Fragilidad por herencia profunda.
 */
class Base {
    public void operacion() {
        paso1();
        paso2();
    }

    protected void paso1() {
        System.out.println("Base Paso 1");
    }

    protected void paso2() {
        System.out.println("Base Paso 2");
    }
}

class Derivada extends Base {
    @Override
    protected void paso1() {
        // Si Base cambia el orden de llamada en operacion(), Derivada puede romperse
        System.out.println("Derivada Paso 1");
    }
}
