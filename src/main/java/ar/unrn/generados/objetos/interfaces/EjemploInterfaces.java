package ar.unrn.generados.objetos.interfaces;

/**
 * Interfaz que define un contrato para objetos que pueden buscarse.
 * En C, logramos comportamientos genéricos mediante punteros a funciones
 * (void*) y qsort/bsearch. En Java, las interfaces permiten definir
 * contratos que las clases deben cumplir para garantizar que ciertos
 * comportamientos estén presentes.
 */
interface Buscable {
    /**
     * @param criterio término para la búsqueda
     *
     * @return verdadero si el objeto coincide con el criterio.
     */
    boolean coincideCon(String criterio);
}

/**
 * Representa un participante del ejemplo de interfaces y deja visible como el cliente colabora con contratos en lugar de clases concretas.
 * El paquete muestra interfaces y sus implementaciones para hacer visible como un contrato comun desacopla al cliente de las clases concretas.
 */
class LibroBuscable implements Buscable {
    private String titulo;
    private String autor;

    public LibroBuscable(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public boolean coincideCon(String criterio) {
        // En Java, el manejo de Strings es mucho más simple que con strcmp y punteros char.
        return titulo.toLowerCase().contains(criterio.toLowerCase()) ||
                autor.toLowerCase().contains(criterio.toLowerCase());
    }

    @Override
    public String toString() {
        return "'" + titulo + "' de " + autor;
    }
}

/**
 * Representa un participante del ejemplo de interfaces y deja visible como el cliente colabora con contratos en lugar de clases concretas.
 * El paquete muestra interfaces y sus implementaciones para hacer visible como un contrato comun desacopla al cliente de las clases concretas.
 */
public class EjemploInterfaces {
    public static void main(String[] args) {
        // El tipo de la referencia es la Interfaz, no la clase concreta.
        Buscable item = new LibroBuscable("Rayuela", "Julio Cortázar");

        String termino = "Cortázar";
        System.out.println("Buscando '" + termino + "' en: " + item);

        if (item.coincideCon(termino)) {
            System.out.println("¡Coincidencia encontrada!");
        } else {
            System.out.println("No se encontró el término.");
        }
    }
}
