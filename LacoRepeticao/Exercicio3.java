package ExerciciosGeneration.LacoRepeticao;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        // 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
        //21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
        //idade for =-99. (WHILE)]

        int idade =0, contMenos = 0, contMais = 0;
        Scanner entrada = new Scanner(System.in);

        while(idade != -99){
            System.out.println("Digite uma idade: ");
            idade = entrada.nextInt();

            if(idade < 21) {
                contMenos++;
            }
            if(idade > 50) {
                contMais++;
            }
        }
        System.out.println("\nQtd de pessoas com idade maior 50 anos: "+ contMais);
        System.out.println("\nQtd de pessoas com idade menos 21 anos: "+ contMenos);

        System.out.println("\nFim da execução, foi digitado: -99");
    }
}