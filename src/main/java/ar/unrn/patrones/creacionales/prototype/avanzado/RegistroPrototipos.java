package ar.unrn.patrones.creacionales.prototype.avanzado;

import java.util.HashMap;
import java.util.Map;

/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete usa Prototype para registrar y clonar objetos a partir de prototipos ya configurados.
 */
interface ComponenteUi extends Cloneable {
    /**
     * @return clon
     */
    ComponenteUi clone();

    /**
     * Visualiza.
     */
    void mostrar();
}

/**
 * Representa el objeto que el ejemplo necesita clonar para reutilizar una configuracion ya preparada con el menor costo posible.
 * El paquete usa Prototype para registrar y clonar objetos a partir de prototipos ya configurados.
 */
public class RegistroPrototipos {
    private Map<String, ComponenteUi> prototipos = new HashMap<>();

    /**
     * @param clave id @param p prototipo
     */
    public void registrar(String clave, ComponenteUi p) {
        prototipos.put(clave, p);
    }

    /**
     * @param clave id @return nuevo clon del prototipo registrado
     */
    public ComponenteUi obtener(String clave) {
        ComponenteUi p = prototipos.get(clave);
        return (p != null) ? p.clone() : null;
    }
}

/**
 * Representa el objeto que el ejemplo necesita clonar para reutilizar una configuracion ya preparada con el menor costo posible.
 * El paquete usa Prototype para registrar y clonar objetos a partir de prototipos ya configurados.
 */
class BotonPersonalizado implements ComponenteUi {
    private String texto;

    public BotonPersonalizado(String t) {
        this.texto = t;
    }

    @Override
    public ComponenteUi clone() {
        return new BotonPersonalizado(this.texto);
    }

    @Override
    public void mostrar() {
        System.out.println("Botón: " + texto);
    }
}
