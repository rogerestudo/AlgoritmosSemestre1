package ExerciciosCap5pag113;

import javax.swing.*;

public class Questao10 {
    public static void main(String[] args) {
        double a;
        int negativo=0;
        for(int i=1;i<=5;i++)
        {
            a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um numero: "));
            if(a < 0)
            {
                negativo++;
            }
        }
        JOptionPane.showMessageDialog(null,negativo + " numeros negativos");
    }
}
