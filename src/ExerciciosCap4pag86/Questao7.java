package ExerciciosCap4pag86;

import javax.swing.*;

public class Questao7 {
    public static void main(String[] args) {
        float n1, n2, n3, n4, media;
        n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 1"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 2"));
        n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 3"));
        n4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota 4"));
        if (n1 < 0 || n2 < 0 || n3 < 0 || n4 < 0) {
            JOptionPane.showMessageDialog(null, "Numero invalido");
        } else {
            media = (n1 + n2 + n3 + n4) / 4;
            if (media >= 6) {
                JOptionPane.showMessageDialog(null, "Voce passou! \n Media:" + media);
            } else {
                JOptionPane.showMessageDialog(null, "Voce não passou :( \n Media:" + media);
            }
        }
    }
}
