package ExerciciosCap4pag86;

import javax.swing.*;

public class Questao10 {
    public static void main(String[] args) {
        String nome1, nome2, nome3;
        int v1, v2, v3;
        nome1 = JOptionPane.showInputDialog(null,"Digite o nome do candidato");
        v1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o total de votos dele: "));
        nome2 = JOptionPane.showInputDialog(null,"Digite o nome do candidato");
        v2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o total de votos dele: "));
        nome3 = JOptionPane.showInputDialog(null,"Digite o nome do candidato");
        v3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o total de votos dele: "));
        if(v1 > v2 && v1 > v3){
            JOptionPane.showMessageDialog(null,"Candidato " + nome1  + " Ganhou!!");
        }
        if(v2 > v1 && v2 > v3){
            JOptionPane.showMessageDialog(null,"Candidato " + nome2 + " Ganhou!!");
        }
        if(v3 > v1 && v3 > v2){
            JOptionPane.showMessageDialog(null,"Candidato " + nome3 + " Ganhou!!");
        }
    }
}
