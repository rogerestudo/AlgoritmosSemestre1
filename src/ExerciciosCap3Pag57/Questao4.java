package ExerciciosCap3Pag57;

import javax.swing.*;

public class Questao4 {
    public static void main(String[] args) {
        int anos;
        String nome;
        nome=JOptionPane.showInputDialog(null,"Digite seu nome: ");
        anos=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade: "));
        if(anos >= 0){
        JOptionPane.showMessageDialog(null,nome + ", você já viveu " + anos*365 + " dias" );
        }else{JOptionPane.showMessageDialog(null,"Numero invalido");}
    }


}
