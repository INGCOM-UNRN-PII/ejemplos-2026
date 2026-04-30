package ar.unrn.codesmells.change_preventers;

/**
 * Change Preventers: Divergent Change, Shotgun Surgery, Parallel Inheritance Hierarchies.
 */
public class ChangePreventers {
}

// 1. Divergent Change (Una clase cambia por muchas razones diferentes)
class Producto {
    // Cambia si cambia la lógica de stock
    public void actualizarStock() {
    }

    // Cambia si cambia la lógica de impuestos
    public void calcularIva() {
    }

    // Cambia si cambia el formato de exportación
    public void exportarXml() {
    }
}

// 2. Shotgun Surgery (Un cambio requiere tocar muchas clases)
class Logger {
    // Si cambio la firma de log(), debo tocar ClaseA, ClaseB, ClaseC...
    public void log(String msg) {
    }
}

class ClaseA {
    void f() {
        new Logger().log("A");
    }
}

class ClaseB {
    void g() {
        new Logger().log("B");
    }
}

// 3. Parallel Inheritance Hierarchies
// Al crear una nueva subclase de Empleado, hay que crear una de Seguro
abstract class Empleado {
}

class Programador extends Empleado {
}

class Gerente extends Empleado {
}

abstract class Seguro {
}

class SeguroProgramador extends Seguro {
}

class SeguroGerente extends Seguro {
}
