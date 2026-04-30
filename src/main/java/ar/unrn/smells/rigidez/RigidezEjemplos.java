package ar.unrn.smells.rigidez;

/**
 * Ejemplo 1: Lógica centralizada y rígida.
 * Agregar un nuevo tipo de reporte requiere modificar múltiples métodos en esta clase.
 */
class GeneradorReporte {
    /**
     * Exporta datos en el formato especificado.
     * 
     * @param datos los datos a exportar.
     * @param tipo  el formato de destino (ej: PDF, CSV).
     */
    public void exportar(String datos, String tipo) {
        if (tipo.equals("PDF")) {
            System.out.println("Exportando PDF...");
        } else if (tipo.equals("CSV")) {
            System.out.println("Exportando CSV...");
        }
    }

    /**
     * Aplica formato a los datos según el tipo.
     * 
     * @param datos los datos a formatear.
     * @param tipo  el formato deseado.
     */
    public void formatear(String datos, String tipo) {
        if (tipo.equals("PDF")) { /* ... */ }
        else if (tipo.equals("CSV")) { /* ... */ }
    }
}

/**
 * Ejemplo 2: Dependencias en cadena (Rigidez ante el cambio de hardware).
 */
class SistemaCaja {
    private ImpresoraFiscal impresora = new ImpresoraFiscal();
    
    /**
     * Realiza el proceso de cobro e imprime el ticket.
     */
    public void cobrar() {
        // La lógica de cobro está amarrada a un modelo específico de impresora
        impresora.imprimirTicketModeloA(); 
    }
}

/**
 * Representa un modelo específico de impresora fiscal.
 */
class ImpresoraFiscal {
    /**
     * Imprime un ticket usando el formato del Modelo A.
     */
    public void imprimirTicketModeloA() { System.out.println("Ticket A"); }
}
