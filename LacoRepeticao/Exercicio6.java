package ExerciciosGeneration.LacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        // Escrever um programa que receba vários números inteiros no teclado. E no
        //final imprimir a média dos números múltiplos de 3. Para sair digitar
        //0(zero).(DO...WHILE)
        int numero = 0, somaTotal = 0;
        Scanner ler = new Scanner(System.in);

        do {

            System.out.println("\n Digite um número, quando quiser parar digite 0: ");
            numero = ler.nextInt();

            somaTotal += numero;

        }while(numero != 0);

        System.out.println("A soma total = "+ somaTotal);
    }

}