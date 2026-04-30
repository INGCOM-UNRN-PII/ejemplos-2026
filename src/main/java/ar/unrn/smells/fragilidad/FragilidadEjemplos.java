package ar.unrn.smells.fragilidad;

/**
 * Representa una configuración compartida de forma estática.
 * Fuente potencial de fragilidad.
 */
class ConfiguracionGlobal {
    /** Tiempo de espera predeterminado en milisegundos. */
    public static int TIMEOUT = 5000;
}

/**
 * Módulo que modifica de forma imprevista el estado global.
 */
class ModuloA {
    /**
     * Ejecuta una acción que altera el TIMEOUT global.
     */
    public void ejecutar() {
        ConfiguracionGlobal.TIMEOUT = 10; // Cambio temporal que rompe ModuloB
    }
}

/**
 * Módulo que depende de la consistencia del estado global.
 */
class ModuloB {
    /**
     * Procesa una tarea validando que el TIMEOUT sea suficiente.
     * 
     * @throws RuntimeException si el tiempo configurado es insuficiente.
     */
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
    /**
     * Orquestación de una operación de múltiples pasos.
     */
    public void operacion() {
        paso1();
        paso2();
    }
    /** Realiza el primer paso. */
    protected void paso1() { System.out.println("Base Paso 1"); }
    /** Realiza el segundo paso. */
    protected void paso2() { System.out.println("Base Paso 2"); }
}

/**
 * Subclase que depende del funcionamiento interno de la clase base.
 */
class Derivada extends Base {
    /**
     * Sobrescribe el paso 1 con lógica específica.
     */
    @Override
    protected void paso1() {
        // Si Base cambia el orden de llamada en operacion(), Derivada puede romperse
        System.out.println("Derivada Paso 1");
    }
}
