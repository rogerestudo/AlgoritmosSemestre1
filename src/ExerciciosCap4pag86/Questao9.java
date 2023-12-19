package ExerciciosCap4pag86;

import javax.swing.*;

public class Questao9 {
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade"));
        if(idade < 0) {
            JOptionPane.showMessageDialog(null,"Numero invalido");
        }else{
            if(idade >= 18){
                JOptionPane.showMessageDialog(null,"Voce é maior de idade");
            }else{
                int restante = 18 - idade;
                JOptionPane.showMessageDialog(null,"Voce é menor de idade\nAinda faltam " + restante + " Anos para ser maior");
        }
        }
}
}
