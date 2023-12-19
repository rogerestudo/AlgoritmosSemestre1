package ExerciciosCap4pag86;

import javax.swing.*;

public class Questao2 {
    public static void main(String[] args) {
        float peso, altura, imc;
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu peso em kg: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua altura em m: "));
        if (peso < 0 || altura < 0) {
            JOptionPane.showMessageDialog(null, "Numero invalido");
        } else {
            imc = peso / (altura * altura);
            if (imc < 18.5) {
                JOptionPane.showMessageDialog(null, "Imc: " + imc + " (abaixo do peso)");
            } else if (imc < 25) {
                JOptionPane.showMessageDialog(null, "Imc: " + imc + " (peso normal)");

            } else if (imc < 30) {
                JOptionPane.showMessageDialog(null, "Imc: " + imc + " (sobrepeso)");

            } else if (imc < 35) {
                JOptionPane.showMessageDialog(null, "Imc: " + imc + " (obeso leve)");

            } else if (imc < 40) {
                JOptionPane.showMessageDialog(null, "Imc: " + imc + " (obeso moderado)");

            } else {
                JOptionPane.showMessageDialog(null, "Imc: " + imc + " (obeso mórbido)");
            }
        }
    }
}
