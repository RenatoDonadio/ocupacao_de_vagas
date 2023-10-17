/**
 * ocupacao_de_vagas
 */
import java.util.Scanner;

public class ocupacao_de_vagas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       
      

        int[] vagao = new int[5];
        int soma;
        int passageiros = 0;
        
        for (int i = 0; i < 5; i++) {

        System.out.println("Insira o número de passageiros " + (i + 1) + ":");
        vagao[i] = teclado.nextInt();
        passageiros += vagao[i];

        if (vagao[i]<0 && vagao[i]>250) {
            i--;
            System.out.println("Número inválido de passageiros");
        }
                
        }
        
        for (int i = 0; i < 5; i++) {
          
         if (vagao[i] < 50) {
            System.out.println("Esse vagao " + (i+1) + " é de nivel Azul");
         } else if (vagao[i] < 101){
            System.out.println("Esse vagao " + (i+1) + " é de nivel Amarelo");
         } else if (vagao [i] < 150) {
            System.out.println("Esse vagao " + (i+1) + " é de nivel Laranja");
         }else{
            System.out.println("Esse vagao " + (i+1) + " é de nivel Vermelho");
         }

         }

           System.out.println("O total de passageiros é: " + passageiros);
        }
    
      


    }
