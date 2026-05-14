package ar.unrn.refactoring.patrones_diseno.intermedio.creacionales.abstract_factory;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde una pantalla crea controles web o movil con if repetidos.
 */
public class PantallaAdministracion {
    public String renderizar(String plataforma) {
        Boton boton;
        Menu menu;
        if ("web".equals(plataforma)) {
            boton = new BotonWeb();
            menu = new MenuWeb();
        } else {
            boton = new BotonMovil();
            menu = new MenuMovil();
        }
        return boton.texto() + " - " + menu.titulo();
    }
}

interface Boton { String texto(); }
interface Menu { String titulo(); }
class BotonWeb implements Boton { @Override public String texto() { return "Boton web"; } }
class BotonMovil implements Boton { @Override public String texto() { return "Boton movil"; } }
class MenuWeb implements Menu { @Override public String titulo() { return "Menu web"; } }
class MenuMovil implements Menu { @Override public String titulo() { return "Menu movil"; } }
