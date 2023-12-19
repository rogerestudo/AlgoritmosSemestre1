package ExerciciosCap6pag140;

import javax.swing.*;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int tam=5;
        double[] saldo = new double[tam];
        String res="";
        for(int i=0;i<tam;i++)
        {
            JOptionPane.showInputDialog(null,"Digite os saldos: (so digite 2 casas apos a virgula)");
            saldo[i] = read.nextDouble();
            res = res + saldo[i] + "\n";
        }
        JOptionPane.showMessageDialog(null,res);
    }
}
