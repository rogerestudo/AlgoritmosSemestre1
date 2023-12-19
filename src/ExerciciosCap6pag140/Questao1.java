package ExerciciosCap6pag140;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        //Essa questao possui muita leitura de numeros, preferi fazer usando Sytem.out
        Scanner read = new Scanner(System.in);
        int maior=0, tam=31, posmaior;
        int[] quantidade = new int[tam];
        int dia=1;
        for(int i=1;i<tam;i++)
        {
            System.out.printf("Digite a quantidade de carros que passaram no dia %d: ",dia);
            quantidade[i]=read.nextInt();
            dia++;
        }
        maior = quantidade[1];
        posmaior = 0;
        for(int x=1;x<tam;x++)
        {
            if(quantidade[x] > maior)
            {
                maior = quantidade[x];
                posmaior=x;
            }
        }
        System.out.printf("Maior volume ocorreu no dia % e fiu de % carros",posmaior,maior);
    }
}
