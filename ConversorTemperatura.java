/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2java;

import java.util.Scanner;

/**
 *
 * @author Desenvolvedor
 */
public class ConversorTemperatura.java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10, y=15, soma;
        soma = x+ y;
        
        System.out.println("O resultado da soma é: "+soma);
    }
    
}
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("A temperatura em Celsius é: " + celsius);
    }
}
