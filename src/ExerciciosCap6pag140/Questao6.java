package ExerciciosCap6pag140;

import javax.swing.*;

public class Questao6 {
    public static void main(String[] args) {
        int tam=5;
        int[][] matrizA =  new int[tam][tam];
        int[][] matrizB = new int[tam][tam];
        int[][] matrizC = new int[tam][tam];
        String matrizc="";
        //Preencher a matriz A:
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite numeros da matriz A: "));
            }
        }
        //Preencher a matriz B:
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite numeros da matriz B: "));

            }
        }
        //Comparar as matrizes:
        for(int i=0;i<tam;i++)
        {
            for(int j=0;j<tam;j++)
            {
                if(matrizA [i][j] == matrizB[i][j]) {
                    matrizC[i][j]=1;
                }else{
                    matrizC[i][j]=0;
                }
                matrizc = matrizc + matrizC[i][j] + " ";
            }
        }
    }
}
