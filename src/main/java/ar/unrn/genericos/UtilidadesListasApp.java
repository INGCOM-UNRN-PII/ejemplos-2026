package ar.unrn.genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilidadesListasApp {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Utilidades de Listas (Wildcards) ---");

        List<Integer> enteros = Arrays.asList(10, 20, 30);
        System.out.print("Lista de enteros: ");
        UtilidadesListas.imprimirLista(enteros);
        System.out.println("Suma: " + UtilidadesListas.sumar(enteros));

        List<Number> numeros = new ArrayList<>();
        UtilidadesListas.agregarNumeros(numeros);
        System.out.print("Lista después de agregar: ");
        UtilidadesListas.imprimirLista(numeros);
    }
}
