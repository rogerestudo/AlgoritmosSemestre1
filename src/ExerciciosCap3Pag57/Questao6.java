package ExerciciosCap3Pag57;

import javax.swing.*;

public class Questao6 {
    public static void main(String[] args) {
        float peso;
        peso=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o peso do prato: "));
        JOptionPane.showMessageDialog(null,"Total a ser pago: " + peso * 12f);
    }
}
