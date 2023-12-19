package ExerciciosCap6pag140;

import javax.swing.*;

public class Questao10 {
    public static void main(String[] args) {

        int qcheques, cheque=1;
        qcheques = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos cheques foram usados no mes?(maximo de 10) "));
        double[] gastos = new double[qcheques];
        String todosValores="";
        double maior, menor;
        if(qcheques <= 10) {
            for (int i = 0; i < qcheques; i++) {
                gastos[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor gasto no cheque " + cheque));
                cheque++;
                todosValores = todosValores + gastos[i] + " ";
            }
            maior=gastos[0];
            menor=gastos[0];

            for (int i = 0; i < gastos.length; i++) {
                if(gastos[i] > maior)
                {
                    maior = gastos[i];
                }
                if(gastos[i] < menor)
                {
                    menor = gastos[i];
                }
            }
            JOptionPane.showMessageDialog(null,"Todos os valores: " + todosValores + "\nMaior valor: " + maior + "\nMenor Valor: " + menor);
        }else{JOptionPane.showMessageDialog(null,"Ultrapassou o numero de cheques maximo");}
    }
}
