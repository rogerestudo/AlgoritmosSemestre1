package ExerciciosCap3Pag57;

import javax.swing.*;

public class Questao9 {
    public static void main(String[] args) {
        int p=10,m=12,g=15;
        int qp, qm, qg;
        qp=Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva a quantidade de camisa p: "));
        qm=Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva a quantidade de camisa m: "));
        qg=Integer.parseInt(JOptionPane.showInputDialog(null,"Escreva a quantidade de camisa g: "));

        if(qp >= 0 && qm >=0 && qg >=0) {
            int res = (qp * p) + (qm * m) + (qg * g);
            JOptionPane.showMessageDialog(null, "Preço final: " + res);
        } else{JOptionPane.showMessageDialog(null,"Numero invalido");}
    }
}
