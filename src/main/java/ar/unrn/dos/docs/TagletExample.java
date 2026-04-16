package ar.unrn.dos;

import java.io.IOException;
import java.util.Objects;

/**
 * Esta clase {@code TagletExample} sirve como un ejemplo exhaustivo
 * del uso de diversos taglets de Javadoc para documentar código Java.
 * Demuestra cómo documentar clases, campos, constructores, métodos y clases anidadas.
 *
 * <p>
 * El propósito principal es ilustrar la sintaxis y el uso de los taglets más comunes
 * y algunos menos frecuentes, proporcionando una referencia clara para la documentación.
 * </p>
 *
 * <pre>{@code
 * TagletExample example = new TagletExample("Ejemplo", 10);
 * System.out.println(example.calculateSum(5, 3));
 * }</pre>
 *
 * @author Tu Nombre
 * @version 1.0.1
 * @since 2023-10-27
 * @see java.lang.Object
 * @see #MAX_VALUE
 * @see #TagletExample(String, int)
 * @see #calculateSum(int, int)
 * @deprecated Esta clase es solo para fines de demostración y no debe usarse en producción.
 */
@Deprecated
public class TagletExample {

    /**
     * Una constante pública que representa el valor máximo permitido.
     * Este valor es inmutable y se utiliza en varias operaciones.
     * El valor actual es {@value}.
     */
    public static final int MAX_VALUE = 100;

    /**
     * Un campo estático que lleva la cuenta de las instancias creadas de esta clase.
     * Se incrementa cada vez que se llama a un constructor.
     */
    private static int instanceCount = 0;

    /**
     * El nombre descriptivo de esta instancia de {@code TagletExample}.
     * Este campo es inicializado por el constructor.
     */
    private String name;

    /**
     * Un valor numérico asociado a esta instancia.
     * Puede ser modificado a través de {@link #setValue(int)}.
     */
    private int value;

    /**
     * Constructor para crear una nueva instancia de {@code TagletExample}.
     * Inicializa el nombre y el valor de la instancia, e incrementa el contador de instancias.
     *
     * @param name  El nombre que se asignará a esta instancia. No puede ser {@code null}.
     * @param value El valor inicial para esta instancia.
     * @throws IllegalArgumentException Si el nombre proporcionado es {@code null} o vacío.
     * @see #instanceCount
     * @see #MAX_VALUE
     */
    public TagletExample(String name, int value) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        this.name = name;
        this.value = value;
        instanceCount++;
    }

    /**
     * Calcula la suma de dos números enteros.
     * Este método es un ejemplo simple de una operación que devuelve un valor.
     *
     * @param a El primer sumando.
     * @param b El segundo sumando.
     * @return La suma de {@code a} y {@code b}.
     * @see #subtract(int, int)
     */
    public int calculateSum(int a, int b) {
        return a + b;
    }

    /**
     * Resta el segundo número del primero.
     *
     * @param a El minuendo.
     * @param b El sustraendo.
     * @return La diferencia entre {@code a} y {@code b}.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Procesa un valor y potencialmente lanza una excepción si el valor excede un límite.
     * Este método demuestra el uso del taglet {@code @throws}.
     *
     * @param input El valor de entrada a procesar.
     * @throws IOException Si el valor de entrada es mayor que {@link #MAX_VALUE}.
     *                     Esto simula una condición de error que podría ocurrir en una operación de E/S.
     * @deprecated Este método está obsoleto; use {@link #processValueSafely(int)} en su lugar.
     */
    @Deprecated
    public void processValue(int input) throws IOException {
        if (input > MAX_VALUE) {
            throw new IOException("El valor de entrada " + input + " excede el máximo permitido " + MAX_VALUE);
        }
        System.out.println("Procesando valor: " + input);
    }

    /**
     * Procesa un valor de forma segura, sin lanzar excepciones de E/S.
     * En su lugar, devuelve un booleano indicando el éxito.
     *
     * @param input El valor de entrada a procesar.
     * @return {@code true} si el valor fue procesado con éxito (no excede {@link #MAX_VALUE}),
     *         {@code false} en caso contrario.
     * @since 1.0.1
     */
    public boolean processValueSafely(int input) {
        if (input > MAX_VALUE) {
            System.err.println("Advertencia: El valor de entrada " + input + " excede el máximo permitido " + MAX_VALUE);
            return false;
        }
        System.out.println("Procesando valor de forma segura: " + input);
        return true;
    }

    /**
     * Obtiene el nombre de esta instancia.
     *
     * @return El nombre de la instancia.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece un nuevo nombre para esta instancia.
     *
     * @param name El nuevo nombre. No puede ser {@code null} o vacío.
     * @throws IllegalArgumentException Si el nombre es {@code null} o vacío.
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        this.name = name;
    }

    /**
     * Obtiene el valor actual de esta instancia.
     *
     * @return El valor actual.
     */
    public int getValue() {
        return value;
    }

    /**
     * Establece un nuevo valor para esta instancia.
     *
     * @param value El nuevo valor.
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Devuelve el número total de instancias de {@code TagletExample} creadas.
     *
     * @return El conteo de instancias.
     * @see #instanceCount
     */
    public static int getInstanceCount() {
        return instanceCount;
    }

    /**
     * Compara este objeto {@code TagletExample} con el objeto especificado.
     * El resultado es {@code true} si y solo si el argumento no es {@code null}
     * y es un objeto {@code TagletExample} que tiene el mismo {@link #name} y {@link #value}.
     *
     * @param o El objeto a comparar con este {@code TagletExample}.
     * @return {@code true} si los objetos son iguales; {@code false} en caso contrario.
     * @see java.lang.Object#equals(Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagletExample that = (TagletExample) o;
        return value == that.value && Objects.equals(name, that.name);
    }

    /**
     * Devuelve un valor de código hash para este objeto.
     * Este método es compatible con {@link #equals(Object)}.
     *
     * @return Un valor de código hash para este objeto.
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    /**
     * Devuelve una representación de cadena de este objeto {@code TagletExample}.
     *
     * @return Una cadena que incluye el nombre y el valor de la instancia.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TagletExample{" +
               "name='" + name + '\'' +
               ", value=" + value +
               '}';
    }

    /**
     * Esta enumeración {@code Status} representa los posibles estados de una operación.
     * Es un ejemplo de cómo documentar una clase anidada o una enumeración.
     *
     * @since 1.0.0
     */
    public enum Status {
        /**
         * Indica que la operación se completó con éxito.
         */
        SUCCESS,
        /**
         * Indica que la operación falló.
         */
        FAILURE,
        /**
         * Indica que la operación está pendiente.
         */
        PENDING
    }

    /**
     * Una interfaz anidada de ejemplo.
     *
     * @param <T> El tipo de dato con el que opera el procesador.
     */
    public interface Processor<T> {
        /**
         * Procesa un elemento dado.
         *
         * @param item El elemento a procesar.
         * @return {@code true} si el procesamiento fue exitoso, {@code false} en caso contrario.
         */
        boolean process(T item);
    }
}
