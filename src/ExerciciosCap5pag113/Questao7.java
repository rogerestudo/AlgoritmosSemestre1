package ExerciciosCap5pag113;

import javax.swing.*;

public class Questao7 {
    public static void main(String[] args) {
        int x, i;
        i=1;
        while(i<20)
        {
            x=i*i;
            JOptionPane.showMessageDialog(null,"x= " + x + " i= " + i);
            i= i + 2;
            JOptionPane.showMessageDialog(null,"Passei por aqui! ");

        }
        JOptionPane.showMessageDialog(null,"Ufa cheguei aqui ");

    }
}
