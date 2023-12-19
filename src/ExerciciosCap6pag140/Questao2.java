package ExerciciosCap6pag140;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        //Essa questao possui muita leitura de numeros, preferi fazer usando Sytem.out
       int tam=31, menor, maior, posmenor=0, posmaior=0, dia=1;
       Scanner read = new Scanner(System.in);
       int[] quantidade = new int[tam];
       for(int i=1;i<tam;i++)
       {
           System.out.printf("Digite o numero do dia %d ", dia);
           quantidade[i] = read.nextInt();
           dia++;
       }

       maior = quantidade[1];
       menor = quantidade[1];

       for(int i=1;i<tam;i++)
       {
            if(quantidade[i] > maior)
            {
                maior = quantidade[i];
                posmaior = i;
            }
            if(quantidade[i] < menor)
            {
                menor = quantidade[i];
                posmenor = i;
            }
       }
       System.out.printf("Maior volume ocorreu no dia % e fiu de % carros",posmaior, maior);
       System.out.printf("\nMenor volume ocorreu no dia % e fiu de % carros",posmenor, menor);
    }
}
