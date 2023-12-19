package ExerciciosCap5pag113;

import javax.swing.*;

public class Questao9 {
    public static void main(String[] args) {
        int n1;
        double n2=11;
        double n3=1;
        double res=0;
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva a quantidade de termos da serie"));
        for(int i=1;i<=n1;i++)
        {

            res += (n3/(n2+1));
            n3++;
            n2+=11;
        }
        JOptionPane.showMessageDialog(null,res);
    }
}
