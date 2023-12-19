package ExerciciosCap4pag86;

import javax.swing.*;

public class Questao8 {
    public static void main(String[] args) {
        int x1, y1, parabola;
        x1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digte x1"));
        y1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digte y1"));

        parabola = (x1*x1) - 3*x1 + 10;
        if(parabola == 0) {
            JOptionPane.showMessageDialog(null,"Pertence a parabola");
        } else if (parabola > 0) {
            JOptionPane.showMessageDialog(null,"Esta acima da parabola");
        }else{JOptionPane.showMessageDialog(null,"Esta abaixo da parabola");}
    }
}
