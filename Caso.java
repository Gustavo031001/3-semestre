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
public class Caso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Caso = new Scanner(System.in);
        int mes;
        System.out.printf("Trimestre de 2023\n\n");
        System.out.printf("Digite o mês desejado do 1° trimestre   ");
        mes = Caso.nextInt();
        switch (mes){
            case 1:{
                System.out.println("O mes digitado é igual a janeiro");
                break;
            }
            case 2:{
                System.out.println("O mes digitado é igual a fevereiro");
                break;
            } 
            case 3:{
                System.out.println("O mes digitado é igual a março");
                break;
            }
            default:{
                System.out.println("O mes digitado esta correto");
            }
        }
    }
    
}
