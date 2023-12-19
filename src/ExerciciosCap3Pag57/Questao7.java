package ExerciciosCap3Pag57;

import javax.swing.*;

public class Questao7 {
    public static void main(String[] args) {
        int dia, mes;
        dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva o dia(numero): "));
        mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva o mes(numero): "));

        if(dia >0 && mes > 0) {
            int res = dia + (mes * 30);
            JOptionPane.showMessageDialog(null, "Dias totais a partir do primeiro dia do ano: " + res);
        }else{JOptionPane.showMessageDialog(null,"Numero invalido");}


    }
}
