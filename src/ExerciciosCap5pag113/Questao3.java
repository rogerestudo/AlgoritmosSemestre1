package ExerciciosCap5pag113;

import javax.swing.*;

public class Questao3 {
    public static void main(String[] args) {
        double sum=0;
        double a;
        a=Double.parseDouble(JOptionPane.showInputDialog(null,"Escreva um numero"));
        for(int i=1;i<=a;i++)
        {
            sum+= 1.0/(2*i);
        }
        JOptionPane.showMessageDialog(null,sum);
    }


}
