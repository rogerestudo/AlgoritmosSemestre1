package ExerciciosCap3Pag57;

import javax.swing.*;

public class Questao5 {
    public static void main(String[] args) {
        float pgasolina, reais, litros;
        pgasolina=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o preço da gasolina: "));
        reais=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite quantos reais voce quer gastar: "));

        if(pgasolina >= 0 && reais >=0) {
            litros = reais / pgasolina;
            JOptionPane.showMessageDialog(null, "Voce consegue por " + litros + " litros de gasolina");
        }else{JOptionPane.showMessageDialog(null,"Numero invalido");}
    }

}
