/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadedados;
import java.util.Scanner;

/**
 *
 * @author Desenvolvedor
 */
public class Entradadedados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float num1, num2, soma;
        System.out.printf("Digite o 1° valor ");
        num1 = ler.nextFloat();
        System.out.printf("Digite o 2° valor ");
        num2 = ler.nextFloat();
        soma = num1 + num2;
        System.out.println("O valor da soma é " +soma);
        
                
        
    }
    
}
