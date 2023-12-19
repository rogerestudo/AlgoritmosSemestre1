package ExerciciosCap6pag140;

import javax.swing.*;

public class Questao9 {
    public static void main(String[] args) {
        double[][] matrizA = new double[5][4];
        int disciplina=1;
        double maior;
        int posmaior=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                matrizA[i][j]=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite as notas da disciplina " + disciplina));
            }
            disciplina++;
        }
        maior=matrizA[0][0];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(matrizA[i][j] > maior)
                {
                    maior = matrizA[i][j];
                    posmaior = i;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"A nota mais alta foi " + maior + " e foi na disciplina " + posmaior);
    }
    }

