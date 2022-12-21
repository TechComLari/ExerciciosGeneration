package ExerciciosGeneration.ProgramaSequencial;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        // 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
        //expressa em segundos e mostre-o expresso em horas, minutos e segundos.

        double tempoMinutos, tempoHoras, tempoSegundos;
        try (Scanner entrada = new Scanner(System.in)){
            System.out.println("Qual o tempo de um evento na produção em segundos? \n");
            tempoSegundos = entrada.nextDouble();
        }
        tempoHoras = (tempoSegundos / 3600);
        System.out.println("A quantidade em horas de um evento é: "+ tempoHoras +" hr \n");

        tempoMinutos = ((tempoSegundos%3600)/60);
        System.out.println("A quantidade em minutos de um evento é: "+ tempoMinutos +" m \n");

        tempoSegundos = ((tempoSegundos%3600)%60);
        System.out.println("A quantidade em segundos de um evento é: "+ tempoSegundos +" s \n");

    }

}