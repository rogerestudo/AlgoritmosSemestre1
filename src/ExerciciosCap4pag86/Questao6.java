package ExerciciosCap4pag86;

import javax.swing.*;

public class Questao6 {
    public static void main(String[] args) {
        int ano;
        ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um ano: "));
        if(ano % 4 ==0) {
            JOptionPane.showMessageDialog(null,ano + " é ano bissexto");
        }else{JOptionPane.showMessageDialog(null,ano + " não é ano bissexto");}

    }
}
