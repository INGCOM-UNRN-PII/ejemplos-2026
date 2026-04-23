package ar.unrn.dos.inmutable.mensaje;

/**
 * Aplicación de consola para demostrar que el uso de clases inmutables
 * (como String) evita los problemas relacionados a referencias compartidas
 * sin necesidad de hacer copias defensivas.
 */
public class MensajeApp {

    static void main() {
        System.out.println("--- Demostración con objetos inmutables (String) ---");

        // 1. Creamos la variable inicial
        String textoInicial = "Hola, inmutabilidad";
        
        // 2. Se la pasamos al constructor
        Mensaje miMensaje = new Mensaje(textoInicial);

        System.out.println("Estado inicial de miMensaje: " + miMensaje);

        // 3. Intentamos "modificar" la variable original desde afuera.
        // Como String es inmutable, no podemos modificar su contenido interno (como sí hacíamos con el array).
        // Lo único que podemos hacer es que la variable 'textoInicial' apunte a un nuevo String.
        textoInicial = "Texto modificado de manera maliciosa";
        
        System.out.println("\nIntentamos modificar 'textoInicial' externamente apuntando a un nuevo valor...");
        System.out.println("Variable externa ahora vale: " + textoInicial);
        
        // 4. Comprobamos el estado del objeto encapsulado
        System.out.println("Estado de miMensaje (¡permanece INTACTO!): " + miMensaje);
        
        System.out.println("\n----------------------------------------------------");
        System.out.println("Conclusión:");
        System.out.println("Al usar objetos inmutables (como String), no es posible");
        System.out.println("alterar el estado interno después de su creación. Por lo tanto,");
        System.out.println("la clase 'Mensaje' no necesita hacer una copia defensiva en su constructor");
        System.out.println("ni al devolver el objeto a través de un getter.");
    }
}
