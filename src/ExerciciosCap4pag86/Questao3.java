package ExerciciosCap4pag86;

import javax.swing.*;

public class Questao3 {
    public static void main(String[] args) {
        float ingresso, precoFinal;
        int idade, dia;
        ingresso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor base do ingresso: "));
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia da semana (1=domingo e 7=sabado)"));
        if (dia < 1 || dia > 7 || idade < 0 || ingresso < 0) {
            JOptionPane.showMessageDialog(null, "Numero invalido");
        } else {
            if (dia == 3) {
                precoFinal = ingresso * 0.50f;
                if (idade < 14) {
                    precoFinal = precoFinal * 0.50f;
                    JOptionPane.showMessageDialog(null, "Preço final do ingresso: " + precoFinal);
                } else {
                    JOptionPane.showMessageDialog(null, "Preço final do ingresso: " + precoFinal);
                }
            } else {

                if (idade < 14) {
                    precoFinal = ingresso * 0.50f;
                    JOptionPane.showMessageDialog(null, "Preço final do ingresso: " + precoFinal);
                } else {
                    JOptionPane.showMessageDialog(null, "Preço final do ingresso: " + ingresso);
                }
            }
        }
    }
}
