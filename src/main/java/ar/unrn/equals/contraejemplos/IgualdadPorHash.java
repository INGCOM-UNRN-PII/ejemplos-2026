package ar.unrn.equals.contraejemplos;

/**
 * Contraejemplo 3: Implementar equals() usando únicamente hashCode().
 * Esto es un error grave porque pueden ocurrir "colisiones".
 * Dos objetos distintos pueden llegar a tener el mismo valor de hashCode.
 */
public class IgualdadPorHash {
    private String texto;

    public IgualdadPorHash(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof IgualdadPorHash that) {
            // ¡MAL! Usar hashCode() para determinar igualdad.
            // Diferentes valores de cadena pueden generar el mismo hashCode (ej: "FB" y "Ea")
            return this.hashCode() == that.hashCode();
        }
        return false;
    }

    @Override
    public int hashCode() {
        // Y combinado con un hashCode _bien_ malo
        return 1;
    }

    public String getTexto() {
        return texto;
    }
}
