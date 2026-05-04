package ar.unrn.patrones.creacionales.prototype.intermedio;

/**
 * Ejemplo de clonación con referencias a otros objetos.
 */
class Habilidad {
    public String nombre;
    public Habilidad(String n) { this.nombre = n; }
}

/** Personaje que requiere clonación. */
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
