package ar.unrn.dos.equals;

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IgualdadPorHash that = (IgualdadPorHash) o;
        
        // ¡MAL! Usar hashCode() para determinar igualdad.
        // Diferentes valores de cadena pueden generar el mismo hashCode (ej: "FB" y "Ea")
        return this.hashCode() == that.hashCode();
    }

    @Override
    public int hashCode() {
        // Usamos el hashCode estándar de String (que puede colisionar)
        return texto != null ? texto.hashCode() : 0;
    }

    public String getTexto() {
        return texto;
    }
}
