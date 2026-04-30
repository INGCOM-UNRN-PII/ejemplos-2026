package ar.unrn.codesmells.oo_abusers;

/**
 * OO Abusers: Switch Statements, Refused Bequest, Alternative Classes with Different Interfaces, Temporary Field.
 */
public class OOAbusers {
    
    // 1. Switch Statements (complejos/repetidos)
    public double calcularComision(String tipo, double venta) {
        switch (tipo) {
            case "ORO": return venta * 0.1;
            case "PLATA": return venta * 0.05;
            default: return 0;
        }
    }
}

// 2. Refused Bequest (La subclase no quiere lo que hereda)
class Pajaro {
    public void volar() { System.out.println("Volando..."); }
}

class Avestruz extends Pajaro {
    @Override
    public void volar() {
        throw new UnsupportedOperationException("Las avestruces no vuelan");
    }
}

// 3. Alternative Classes with Different Interfaces
class LectorJson {
    public void leerArchivo(String p) {}
}
class XmlParser {
    public void parsearDocumento(String f) {}
}

// 4. Temporary Field (campos que solo se usan en un proceso específico)
class ProcesadorCalculo {
    private double resultadoTemporal; // Solo tiene valor mientras corre calcular()
    
    public void calcular(double a, double b) {
        resultadoTemporal = a * b;
        System.out.println(resultadoTemporal);
    }
}
