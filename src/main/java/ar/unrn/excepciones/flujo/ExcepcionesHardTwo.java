package ar.unrn.excepciones.flujo;

public class ExcepcionesHardTwo {

    static StringBuilder log = new StringBuilder();

    public static void main(String[] args) {
        log.append("X");
        try {
            metodoA();
            log.append("-I");
        } catch (Exception e) {
            log.append("-J");
        } finally {
            log.append("-K");
        }
        System.out.println(log);
    }

    public static void metodoA() {
        try {
            log.append("-A");
            metodoB();
            log.append("-B");
        } catch (NumberFormatException e) {
            log.append("-C");
        } catch (Exception e) {
            log.append("-D");
        } finally {
            log.append("-E");
//            return;
        }
        //log.append("-F");
    }

    public static void metodoB() {
        try {
            log.append("-G");
            throw new NumberFormatException("Numero malo");
        } finally {
            log.append("-H");
            throw new IllegalArgumentException(); // Suprime la excepción anterior
        }
    }
}


