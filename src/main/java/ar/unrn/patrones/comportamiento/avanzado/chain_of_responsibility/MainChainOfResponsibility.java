package ar.unrn.patrones.comportamiento.avanzado.chain_of_responsibility;

/**
 * Orquesta la ejecucion del ejemplo y muestra como una solicitud atraviesa varios handlers hasta encontrar responsable.
 * El paquete usa Chain of Responsibility para escalar solicitudes sin acoplar al cliente con un handler concreto.
 */
public class MainChainOfResponsibility {
    public static void main(String[] args) {
        ManejadorSoporte bot = new BotPrimerNivel();
        ManejadorSoporte agente = new AgenteAplicacion();
        ManejadorSoporte especialista = new EspecialistaInfraestructura();

        bot.enlazarCon(agente).enlazarCon(especialista);

        System.out.println("--- Nivel avanzado: Chain of Responsibility ---");
        bot.resolver(new SolicitudSoporte(CategoriaSoporte.ACCESO, 1, "Restablecer clave olvidada"));
        System.out.println();
        bot.resolver(new SolicitudSoporte(CategoriaSoporte.FUNCIONAL, 2, "No encuentro el reporte mensual"));
        System.out.println();
        bot.resolver(new SolicitudSoporte(CategoriaSoporte.INFRAESTRUCTURA, 3, "La API no responde y hay alta latencia"));
    }
}
