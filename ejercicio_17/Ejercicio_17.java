package com.mycompany.ejercicio_17;
import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {
        float area, longitud;
        System.out.println("ingrese el radio del circulo");
        Scanner entrada = new Scanner(System.in);
        float radio = entrada.nextInt();
        area = (float) (Math.PI * Math.pow(radio,2));
        longitud = (float) (2 * Math.PI * radio);
        System.out.println("el area del circulo es " + area );
        System.out.println("la longitud del circulo es " + longitud);
        
    }
}
