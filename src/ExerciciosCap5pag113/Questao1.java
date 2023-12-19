package ExerciciosCap5pag113;

import javax.swing.*;

public class Questao1 {
    public static void main(String[] args) {
        int continuar =1;
        int carros;
        while (continuar == 1)
        {
            carros = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quanto carros voce produziu hoje"));
            continuar = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja continuar? Digite 1\nDeseja parar? Digite -1"));
            carros += carros;
        }

    }
}
