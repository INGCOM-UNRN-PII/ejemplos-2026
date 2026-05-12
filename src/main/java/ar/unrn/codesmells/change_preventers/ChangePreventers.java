package ar.unrn.codesmells.change_preventers;

/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
public class ChangePreventers {
}

/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
class Producto {
    /** Actualiza las existencias en inventario. */
    public void actualizarStock() {}
    /** Calcula el impuesto al valor agregado. */
    public void calcularIva() {}
    /** Genera una representación XML del producto. */
    public void exportarXml() {}
}

/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
class Logger { 
    /** @param msg mensaje a loggear. */
    public void log(String msg) {} 
}
/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
class ClaseA { 
    /** Llama al logger. */
    void f() { new Logger().log("A"); } 
}
/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
class ClaseB { 
    /** Llama al logger. */
    void g() { new Logger().log("B"); } 
}

/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
abstract class Empleado {}
/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
class Programador extends Empleado {}
/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
class Gerente extends Empleado {}

/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
abstract class Seguro {}
/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
class SeguroProgramador extends Seguro {}
/**
 * Representa una pieza del ejemplo donde el diseño propaga el impacto de cada modificacion a demasiados puntos del sistema.
 * El paquete reúne ejemplos de change preventers, donde la estructura del codigo vuelve costoso modificar una parte sin arrastrar muchas otras.
 */
class SeguroGerente extends Seguro {}
