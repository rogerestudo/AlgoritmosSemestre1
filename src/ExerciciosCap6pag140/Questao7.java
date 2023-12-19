package ExerciciosCap6pag140;

import javax.swing.*;

public class Questao7 {
    public static void main(String[] args) {
        int tam=15;
        int n1=1;
        double[] vetorA = new double[tam];
        double[] vetorB= new double[tam];
        double[] vetorC= new double[tam];
        String res="";
        for(int i=0;i<tam;i++)
        {
            vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o  preço A do produto : " + n1));
            n1++;
        }
        for(int i=0;i<tam;i++)
        {
            vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o preço B do produto: " + n1));
        }
        for(int i=0;i<tam;i++)
        {
            vetorC[i]=vetorA[i] + vetorB[i];
            vetorC[i]=vetorC[i]/2;
            res = res + vetorC[i] + " ";

        }
        JOptionPane.showMessageDialog(null,"A media dos preços do 1 ao 15 : " + res);


    }
}
