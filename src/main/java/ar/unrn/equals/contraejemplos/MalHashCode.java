package ar.unrn.equals.contraejemplos;

import java.util.Objects;

/**
 * Contraejemplo 2: Implementación defectuosa de hashCode().
 * Si dos objetos son iguales (equals retorna true), su hashCode DEBE ser el mismo.
 * Si el hashCode es aleatorio o no usa los mismos campos que equals,
 * las estructuras basadas en hash (como HashSet, HashMap) fallarán al buscar o guardar el objeto.
 */
public class MalHashCode {
    private String id;

    public MalHashCode(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof MalHashCode that) {
            return Objects.equals(id, that.id);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        // ¡MAL! Retornar un valor aleatorio viola completamente el contrato de hashCode.
        // Si dos objetos son equals(), deben tener el mismo hashCode. 
        // Aquí cada vez que llamamos a hashCode, o en diferentes instancias con mismo 'id', 
        // devolveremos un valor distinto. No funcionará con Colecciones basadas en Hash.
        return Objects.hash(id);//(int) (Math.random() * 1000);
    }
}
