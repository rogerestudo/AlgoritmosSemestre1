package ExerciciosCap5pag113;

import javax.swing.*;

public class Questao4 {
    public static void main(String[] args) {
        int fim;
        fim=Integer.parseInt(JOptionPane.showInputDialog(null,"Me indique a precisao que voce quer no numero pi"));
        double pi=4;
        for(double i=3;i<=fim;i+=4)
        {
            pi-=4/i;// 4 - 4/3 - 4/7 - 4/11 - 4/15 ... 4/<=fim = res

        }
        for(double x=5;x<=fim;x+=4)
        {
            pi+=4/x;//res + 4/5 + 4/9 + 4/13 + 4/17 ... 4/<=fim = pi
        }

        JOptionPane.showMessageDialog(null,pi);
    }
}
