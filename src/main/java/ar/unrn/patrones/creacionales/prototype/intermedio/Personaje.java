package ar.unrn.patrones.creacionales.prototype.intermedio;

/**
 * Representa el objeto que el ejemplo necesita clonar para reutilizar una configuracion ya preparada con el menor costo posible.
 * El paquete discute Prototype a partir de objetos que deben copiarse conservando o duplicando sus referencias segun el caso.
 */
class Habilidad {
    public String nombre;
    public Habilidad(String n) { this.nombre = n; }
}

/**
 * Representa el objeto que el ejemplo necesita clonar para reutilizar una configuracion ya preparada con el menor costo posible.
 * El paquete discute Prototype a partir de objetos que deben copiarse conservando o duplicando sus referencias segun el caso.
 */
public class Personaje implements Cloneable {
    public String nombre;
    public Habilidad habilidadPrincipal;

    public Personaje(String n, Habilidad h) {
        this.nombre = n;
        this.habilidadPrincipal = h;
    }

    /** Clonación que debe considerar si es superficial o profunda. */
    @Override
    public Personaje clone() {
        try {
            Personaje clon = (Personaje) super.clone();
            // Para copia profunda:
            // clon.habilidadPrincipal = new Habilidad(this.habilidadPrincipal.nombre);
            return clon;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
