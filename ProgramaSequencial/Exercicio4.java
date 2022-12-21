package ExerciciosGeneration.ProgramaSequencial;

import java.util.Scanner;

public class Exercicio4 {
        public static void main(String[] args) {
            // 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
            //calcule a seguinte expressão:

            double A, B, C, D, R, S;
            try (Scanner recebe = new Scanner(System.in)) {
                System.out.println("Digite um valor: \n");
                A = recebe.nextInt();
                B = recebe.nextInt();
                C = recebe.nextInt();
            }
            System.out.println(A +" "+ B+" "+ C);
            R = Math.pow(A + B, 2);
            S = Math.pow(B + C, 2);

            D = (R + S)/2;
            System.out.println("O resultado da expressão é:\n "+ D);
        }
}
