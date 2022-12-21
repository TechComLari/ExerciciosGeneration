package ExerciciosGeneration.ProgramaSequencial;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
        //expressa em anos, meses e dias.

        int idadeAnos, idadeMeses, idadeDias;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Informe sua idade em qtd. dias: \n");
            idadeDias = entrada.nextInt();
        }

        idadeAnos = (idadeDias / 365);
        System.out.println("A idade informada é: "+ idadeAnos +" anos \n");

        idadeMeses = (idadeDias * 12) / 365;
        System.out.println("A idade informada é: "+ idadeMeses +" meses \n");
    }

}
