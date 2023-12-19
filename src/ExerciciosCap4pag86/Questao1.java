package ExerciciosCap4pag86;

import javax.swing.*;

public class Questao1 {
    public static void main(String[] args) {
        int saldoInicial, creditos, debitos, saldoFinal;
        saldoInicial = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva seu saldo inicial"));
        debitos = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva o total de debitos"));
        creditos = Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva o total de creditos"));

        saldoFinal = saldoInicial - debitos + creditos;

        if(saldoFinal > 0) {
            JOptionPane.showMessageDialog(null,"Saldo positivo R$" + saldoFinal);
        } else if (saldoFinal < 0) {
            JOptionPane.showMessageDialog(null,"Saldo negativo R$" + saldoFinal);
        }else {JOptionPane.showMessageDialog(null,"Saldo zero");}


    }
}
