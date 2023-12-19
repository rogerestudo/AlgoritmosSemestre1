package ExerciciosCap4pag86;

import javax.swing.*;

public class Questao4 {
    public static void main(String[] args) {
        float valor;
        valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um valor: "));
        if(valor % 2 == 0) {
            JOptionPane.showMessageDialog(null,valor*valor);
        }else{JOptionPane.showMessageDialog(null,valor*valor*valor);}

    }
}
