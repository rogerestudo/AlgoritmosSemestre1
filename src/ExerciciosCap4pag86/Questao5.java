package ExerciciosCap4pag86;

import javax.swing.*;

public class Questao5 {
    public static void main(String[] args) {
        float km, gasto, consumo;
        km = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite quantos km voce pecorreu: "));
        gasto = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite quantos litros de gasolina gastou: "));
        //km/l
        if (km < 0 || gasto < 0) {
            JOptionPane.showMessageDialog(null, "Numero invalido");
        } else {
            consumo = km / gasto;
            if (consumo <= 15) {
                JOptionPane.showMessageDialog(null, consumo + "km/l o carro é economico");

            } else {
                JOptionPane.showMessageDialog(null, consumo + "km/l o carro não é economico");
            }

        }
    }
}
