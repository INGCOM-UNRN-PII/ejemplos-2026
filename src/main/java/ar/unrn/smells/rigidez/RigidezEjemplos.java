package ar.unrn.smells.rigidez;

/**
 * Representa una pieza del ejemplo donde una modificacion puntual obliga a tocar varias clases relacionadas.
 * El paquete muestra rigidez, donde una modificacion puntual obliga a tocar muchas clases relacionadas para mantener todo funcionando.
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
 * Representa una pieza del ejemplo donde una modificacion puntual obliga a tocar varias clases relacionadas.
 * El paquete muestra rigidez, donde una modificacion puntual obliga a tocar muchas clases relacionadas para mantener todo funcionando.
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
 * Representa una pieza del ejemplo donde una modificacion puntual obliga a tocar varias clases relacionadas.
 * El paquete muestra rigidez, donde una modificacion puntual obliga a tocar muchas clases relacionadas para mantener todo funcionando.
 */
class ImpresoraFiscal {
    /**
     * Imprime un ticket usando el formato del Modelo A.
     */
    public void imprimirTicketModeloA() { System.out.println("Ticket A"); }
}
