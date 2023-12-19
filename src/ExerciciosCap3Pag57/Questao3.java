package ExerciciosCap3Pag57;

import javax.swing.*;

public class Questao3 {
    public static void main(String[] args) {
        int pao, broa;
        float arrecadado;
        pao=Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de paes vendidos: "));
        broa=Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de broas vendidos: "));
        if(pao >= 0 && broa >= 0) {
            arrecadado = (pao * 0.12f) + (broa * 1.50f);
            JOptionPane.showMessageDialog(null, "Dinheiro arrecadado: " + arrecadado);
            JOptionPane.showMessageDialog(null, "Poupança(10% do total arrecadado: )" + arrecadado * 0.10);
        }


    }

}
