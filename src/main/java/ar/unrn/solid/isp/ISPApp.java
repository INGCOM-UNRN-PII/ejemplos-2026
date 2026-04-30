package ar.unrn.solid.isp;

public class ISPApp {
    public static void main(String[] args) {
        System.out.println("--- ISP: Interface Segregation Principle ---");
        
        Humano humano = new Humano();
        Robot robot = new Robot();
        
        humano.trabajar();
        humano.comer();
        
        robot.trabajar();
        // robot.comer(); // No compila, lo cual es correcto para ISP
    }
}
