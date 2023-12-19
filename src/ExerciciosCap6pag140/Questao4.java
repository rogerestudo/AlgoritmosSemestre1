package ExerciciosCap6pag140;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matrizA = new int[3][2];
        int[][] matrizB = new int[2][3];
        int[][] matrizC = new int[3][3];


        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = read.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = read.nextInt();
            }
        }


        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                for (int k = 0; k < matrizA[i].length; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }


        System.out.println("Matriz resultante:");
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }
    }

