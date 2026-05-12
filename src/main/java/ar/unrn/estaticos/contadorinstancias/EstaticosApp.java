package ar.unrn.estaticos.contadorinstancias;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete usa miembros estaticos para mostrar como varias instancias pueden compartir informacion de clase y que costo conceptual tiene ese acoplamiento global.
 */
public class EstaticosApp {

    public static void main(String[] args) {
        System.out.println("--- Demostración de Miembros Estáticos ---\n");

        System.out.println("1. Acceso antes de crear cualquier objeto (Acceso por CLASE):");

        // Llamamos al método ESTÁTICO a través del nombre de la CLASE (no de un objeto).
        // Esto es posible porque el método 'getCantidadTotalCreada' pertenece a la clase,
        // y su variable 'cantidadTotalCreada' ya existe en memoria, independientemente 
        // de si se han creado objetos o no.
        int cantidadInicial = ContadorInstancias.getCantidadTotalCreada();

        System.out.println("   Cantidad inicial de objetos creados: " + cantidadInicial);


        System.out.println("\n2. Creación de objetos...");

        ContadorInstancias obj1 = new ContadorInstancias();
        System.out.println("   Se creó un objeto. ID asignado: " + obj1.getId());

        ContadorInstancias obj2 = new ContadorInstancias();
        System.out.println("   Se creó otro objeto. ID asignado: " + obj2.getId());


        System.out.println("\n3. Acceso a las variables después de crear objetos:");

        // Volvemos a acceder a la variable estática compartida a través de la clase.
        int cantidadFinal = ContadorInstancias.getCantidadTotalCreada();
        System.out.println("   Cantidad total de objetos creados según la clase: " + cantidadFinal);

        // También podríamos intentar acceder al método estático usando una instancia:
        // int cantidadIncorrecta = obj1.getCantidadTotalCreada(); 
        // ¡CUIDADO! Esto en Java funciona, pero es una MALA PRÁCTICA. 
        // Da la falsa impresión de que estamos consultando el estado de 'obj1'
        // cuando en realidad estamos consultando el estado de toda la clase.
        // Siempre debes invocar los métodos y variables estáticas usando NombreClase.metodoEstático()

        System.out.println("\n--------------------------------------------------");
        System.out.println("Conclusión:");
        System.out.println("La variable de instancia 'id' es propia de cada objeto (obj1 tiene ID-1, obj2 tiene ID-2).");
        System.out.println("La variable estática 'cantidadTotalCreada' es ÚNICA Y COMPARTIDA por toda la clase,");
        System.out.println("y puede ser consultada usando ContadorInstancias.getCantidadTotalCreada() sin necesidad");
        System.out.println("de instanciar ningún objeto.");
    }
}
