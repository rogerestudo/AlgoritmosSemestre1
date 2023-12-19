package ExerciciosCap5pag113;

import javax.swing.*;

public class Questao5 {
    public static void main(String[] args) {
        double n1, res;
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva um numero"));
        JOptionPane.showMessageDialog(null,potencia(n1));
    }
    public static double potencia(double a)
    {
        double res=1;
        for(int i=1;i<=5;i++)
        {
            res= a * res;

        }
        return res;
    }
}
