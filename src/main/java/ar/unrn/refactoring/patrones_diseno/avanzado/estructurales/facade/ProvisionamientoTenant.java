package ar.unrn.refactoring.patrones_diseno.avanzado.estructurales.facade;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el alta de tenant coordina demasiados subsistemas desde afuera.
 */
public class ProvisionamientoTenant {
    private final AuthService auth = new AuthService();
    private final StorageService storage = new StorageService();
    private final QueueService queue = new QueueService();
    private final BillingService billing = new BillingService();

    public void crear(String tenant) {
        auth.crear(tenant);
        storage.crear(tenant);
        queue.crear(tenant);
        billing.crear(tenant);
    }
}

class AuthService { public void crear(String tenant) { System.out.println("Auth " + tenant); } }
class StorageService { public void crear(String tenant) { System.out.println("Storage " + tenant); } }
class QueueService { public void crear(String tenant) { System.out.println("Queue " + tenant); } }
class BillingService { public void crear(String tenant) { System.out.println("Billing " + tenant); } }
