package ar.unrn.patrones.comportamiento.ejercicio.state;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete implementa una maquina expendedora con State para mover las reglas de cada situacion a objetos de estado independientes.
 */
public class MainState {
    public static void main(String[] args) {
        System.out.println("--- Máquina con 2 bebidas ---");
        MaquinaExpendedora maquina = new MaquinaExpendedora(2);

        // Flujo 1: Pedir sin pagar
        maquina.solicitarBebida();

        // Flujo 2: Pagar de menos
        maquina.insertarMoneda(3);
        maquina.insertarMoneda(3);
        maquina.insertarMoneda(3);

        // Flujo 3: Comprar exitosamente (Stock pasa de 2 a 1)
        maquina.insertarMoneda(10);
        maquina.solicitarBebida();

        System.out.println("\n--- Arrepentimiento ---");
        // Flujo 4: Insertar y arrepentirse
        maquina.insertarMoneda(15); // Acepta la moneda de $10 o más
        maquina.expulsarMoneda();

        System.out.println("\n--- Última bebida ---");
        // Flujo 5: Comprar última bebida (Stock pasa de 1 a 0 -> Agotado)
        maquina.insertarMoneda(10);
        maquina.solicitarBebida();

        System.out.println("\n--- Sin stock ---");
        // Flujo 6: Intentar comprar sin stock
        maquina.insertarMoneda(10);
        maquina.solicitarBebida();
    }
}
