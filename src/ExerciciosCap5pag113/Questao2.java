package ExerciciosCap5pag113;

import javax.swing.*;

public class Questao2 {


        public static void main(String[] args) {
            // Loop para percorrer os números de 1 a 100
            for (int i = 1; i <= 100; i++) {
                // Calcula o quadrado do número
                int quadrado = i * i;

                // Verifica se o quadrado é menor ou igual a 10000
                if (quadrado <= 10000) {
                    // Imprime o quadrado
                    System.out.println(quadrado);
                } else {
                    // Se o quadrado ultrapassar 10000, interrompe o loop
                    break;
                }
            }
        }
    }



