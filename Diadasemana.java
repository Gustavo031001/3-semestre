/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diadasemana;
import java.util.Scanner;

/**
 *
 * @author Desenvolvedor
 */
public class Diadasemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner semana = new Scanner(System.in);
          int dia;
        System.out.printf("digite o numero\n\n");
        System.out.printf("Digite o dia da semana   ");
        dia = semana.nextInt();
        switch (dia){
            case 1:{
                 System.out.println("O dia digitado é igual a domingo");
                break;
                
            }
            
            case 2:{
                 System.out.println("O dia digitado é igual a segunda");
                break;
                
            }
            
            case 3:{
                 System.out.println("O dia digitado é igual a terça");
                break;
                
            }
            
            case 4:{
                 System.out.println("O dia digitado é igual a quarta");
                break;
                
            }
            
            case 5:{
                 System.out.println("O dia digitado é igual a quinta");
                break;
                
            }
            
            case 6:{
                 System.out.println("O dia digitado é igual a sexta");
                break;
                
            }
            
            case 7:{
                 System.out.println("O dia digitado é igual a sabado");
                break;
                
            }
            
            default:{
                System.out.println("O dia está incorreto");
            }
            
        }
    }
    
}
