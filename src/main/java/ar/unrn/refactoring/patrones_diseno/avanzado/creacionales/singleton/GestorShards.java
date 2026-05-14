package ar.unrn.refactoring.patrones_diseno.avanzado.creacionales.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde cada modulo crea su propio coordinador de shards.
 */
public class GestorShards {
    private final List<String> shards = new ArrayList<>();

    public void registrar(String shard) {
        shards.add(shard);
    }

    public int total() {
        return shards.size();
    }
}

class ModuloFacturacion {
    public GestorShards gestor() {
        return new GestorShards();
    }
}

class ModuloAuditoria {
    public GestorShards gestor() {
        return new GestorShards();
    }
}
