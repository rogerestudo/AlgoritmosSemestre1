package ExerciciosCap3Pag57;

import javax.swing.*;

public class Questao1 {
    public static void main(String[] args) {
        float lado, altura;
        lado=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a medida do lado: "));
        altura=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a medida da altura: "));
        if(lado > 0 && altura > 0){
        JOptionPane.showMessageDialog(null,"A area do terreno é: " + lado*altura);
        }else{JOptionPane.showMessageDialog(null,"Numero invalido");}
    }
}
