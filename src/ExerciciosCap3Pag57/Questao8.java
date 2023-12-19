package ExerciciosCap3Pag57;

import javax.swing.*;

public class Questao8 {
    public static void main(String[] args) {
        //mp=media ponderada
        float n1,n2,n3,mp;
        int p1=1,p2=2,p3=3;
        n1=Float.parseFloat(JOptionPane.showInputDialog(null,"Escreva sua nota1: "));
        n2=Float.parseFloat(JOptionPane.showInputDialog(null,"Escreva sua nota2: "));
        n3=Float.parseFloat(JOptionPane.showInputDialog(null,"Escreva sua nota3: "));

        if(n1 >= 0 && n2 >= 0 && n3 >=0) {
            mp = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / p1 + p2 + p3;
            JOptionPane.showMessageDialog(null, "Media ponderada: " + mp);
        } else{JOptionPane.showMessageDialog(null,"Numero invalido");}

    }
}
