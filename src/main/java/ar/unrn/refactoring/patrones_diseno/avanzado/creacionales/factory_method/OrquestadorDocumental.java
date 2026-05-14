package ar.unrn.refactoring.patrones_diseno.avanzado.creacionales.factory_method;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el orquestador decide que parser concreto crear con condicionales repetidas.
 */
public class OrquestadorDocumental {
    public String procesar(String tipo, String origen) {
        ParserDocumento parser;
        if ("pdf".equals(tipo)) {
            parser = new ParserPdf();
        } else if ("xml".equals(tipo)) {
            parser = new ParserXml();
        } else {
            parser = new ParserTexto();
        }
        return parser.parsear(origen);
    }
}

interface ParserDocumento {
    String parsear(String origen);
}

class ParserPdf implements ParserDocumento {
    @Override
    public String parsear(String origen) { return "PDF:" + origen; }
}

class ParserXml implements ParserDocumento {
    @Override
    public String parsear(String origen) { return "XML:" + origen; }
}

class ParserTexto implements ParserDocumento {
    @Override
    public String parsear(String origen) { return "TXT:" + origen; }
}
