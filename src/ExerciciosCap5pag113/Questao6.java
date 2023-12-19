package ExerciciosCap5pag113;

import javax.swing.*;

public class Questao6 {
    public static void main(String[] args) {
        double n1, n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a base"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o expoente"));
        JOptionPane.showMessageDialog(null,pow(n1, n2));
    }
    public static double pow(double a, double b)
    {
        double res=1;
        for(int i=0;i<b;i++)
        {

           if(b == 0 && a != 0)
           {
               res=1;
           }else{
               res *= a ;
           }
        }
        return res;

    }
}
