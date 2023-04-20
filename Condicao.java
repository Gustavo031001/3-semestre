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
public class Condicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner cond = new Scanner(System.in);
         float nota1, nota2, nota3, media;
         System.out.printf("Notas do Aluno Clodoaldo\n\n");
         System.out.printf("Digite a nota 1     ");
         nota1 = cond.nextFloat();
         System.out.printf("Digite a nota 2     ");
         nota2 = cond.nextFloat();
         System.out.printf("Digite a nota 3     ");
         nota3 = cond.nextFloat();
         media = (nota1+nota2+nota3)/3;
         if (media>=5){
             System.out.println("Aluno aprovado");
             
         }
         else{
             System.out.println("Auno reprovado");
         }
    }
    
}
