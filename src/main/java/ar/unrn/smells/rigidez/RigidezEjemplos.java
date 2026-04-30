package ar.unrn.smells.rigidez;

/**
 * Ejemplo 1: Lógica centralizada y rígida.
 * Agregar un nuevo tipo de reporte requiere modificar múltiples métodos en esta clase.
 */
class GeneradorReporte {
    public void exportar(String datos, String tipo) {
        if (tipo.equals("PDF")) {
            System.out.println("Exportando PDF...");
        } else if (tipo.equals("CSV")) {
            System.out.println("Exportando CSV...");
        }
        // Si quiero XML, debo venir aquí a modificar.
    }

    public void formatear(String datos, String tipo) {
        if (tipo.equals("PDF")) { /* ... */ }
        else if (tipo.equals("CSV")) { /* ... */ }
        // Nuevamente, rigidez ante el cambio.
    }
}

/**
 * Ejemplo 2: Dependencias en cadena.
 */
class SistemaCaja {
    private ImpresoraFiscal impresora = new ImpresoraFiscal();
    
    public void cobrar() {
        // La lógica de cobro está amarrada a un modelo específico de impresora
        impresora.imprimirTicketModeloA(); 
    }
}

class ImpresoraFiscal {
    public void imprimirTicketModeloA() { System.out.println("Ticket A"); }
}
