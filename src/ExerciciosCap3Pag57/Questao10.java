package ExerciciosCap3Pag57;

import javax.swing.*;

public class Questao10 {
    public static void main(String[] args) {
        double x1,x2, y1, y2, euclides;
        x1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o x1"));
        y1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o y1"));
        x2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o x2"));
        y2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o y2"));
        JOptionPane.showMessageDialog(null,"A distancia é: " + euclides(x1, y1, x2, y2));

    }
    public static double euclides(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
}
