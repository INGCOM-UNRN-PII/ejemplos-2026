package ar.unrn.patrones.estructurales.flyweight;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete modela Flyweight para compartir estado intrinseco y evitar repetir datos pesados en cada objeto del bosque.
 */
public class MainFlyweight {
    public static void main(String[] args) {
        Bosque bosque = new Bosque();

        bosque.plantarArbol(10, 20, "Roble", "Verde Oscuro", "TexturaRobleHD");
        bosque.plantarArbol(15, 25, "Roble", "Verde Oscuro", "TexturaRobleHD");
        bosque.plantarArbol(30, 40, "Pino", "Verde Claro", "TexturaPinoHD");
        bosque.plantarArbol(35, 45, "Roble", "Verde Oscuro", "TexturaRobleHD");

        System.out.println("\nDibujando el bosque:");
        bosque.dibujar();
    }
}
