package ExerciciosCap3Pag57;

import javax.swing.JOptionPane;

public class Questao2 {
    public static void main(String[] args) {
        int cavalos;
        cavalos=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de cavalos: "));
        if(cavalos >= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade de ferradura necessarias: " + cavalos * 2);
        }else{JOptionPane.showMessageDialog(null,"Numero invalido");}

    }
}
