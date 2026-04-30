package ar.unrn.codesmells.change_preventers;

/**
 * Clase que agrupa ejemplos de Code Smells de tipo "Change Preventers".
 */
public class ChangePreventers {
}

/**
 * Clase con "Divergent Change". Cambia por motivos de stock, impuestos o exportación.
 */
class Producto {
    /** Actualiza las existencias en inventario. */
    public void actualizarStock() {}
    /** Calcula el impuesto al valor agregado. */
    public void calcularIva() {}
    /** Genera una representación XML del producto. */
    public void exportarXml() {}
}

/** Clase involucrada en "Shotgun Surgery". */
class Logger { 
    /** @param msg mensaje a loggear. */
    public void log(String msg) {} 
}
/** Dependiente de Logger. */
class ClaseA { 
    /** Llama al logger. */
    void f() { new Logger().log("A"); } 
}
/** Dependiente de Logger. */
class ClaseB { 
    /** Llama al logger. */
    void g() { new Logger().log("B"); } 
}

/** Superclase para empleados en jerarquía paralela. */
abstract class Empleado {}
/** Programador. */
class Programador extends Empleado {}
/** Gerente. */
class Gerente extends Empleado {}

/** Superclase para seguros en jerarquía paralela. */
abstract class Seguro {}
/** Seguro para programador. */
class SeguroProgramador extends Seguro {}
/** Seguro para gerente. */
class SeguroGerente extends Seguro {}
