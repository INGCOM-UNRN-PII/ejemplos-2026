package ar.unrn.excepciones.flujo;

public class ExcepcionesHardOne {
    private static StringBuffer mensaje = new StringBuffer("Inicio");
    public static void main(String[] args) {
        try {
            mensaje.append("|A");
            funcionUno(2); // PARA MODIFICAR
            mensaje.append("|B");
        } catch (UnaExcepcion e) {
            mensaje.append("|C");
        } catch (RuntimeException e) {
            mensaje.append("|D");
        } finally {
            mensaje.append("|E");
        }
        System.out.println(mensaje);
    }
    public static void funcionUno(int x) {
        try {
            mensaje.append("|F");
            int resultado = 10 / (x - 2); // Lanza ArithmeticException
            mensaje.append("|G");
        } catch (ArrayIndexOutOfBoundsException e) {
            mensaje.append("|H");
        } finally {
            mensaje.append("|I");
            funcionDos();
            mensaje.append("|J");
        }
        mensaje.append("|K");
    }
    public static void funcionDos() {
        try {
            mensaje.append("|L");
            throw new UnaExcepcion("Error");
        } catch (ArithmeticException e) {
            mensaje.append("|M");
        }
    }
    static class UnaExcepcion extends RuntimeException {
        public UnaExcepcion(String mensaje) {
            super(mensaje);
        }
    }
}