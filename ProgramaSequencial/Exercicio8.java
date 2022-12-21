package ExerciciosGeneration.ProgramaSequencial;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        // 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
        //percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
        //Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
        //escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
        //consumidor.

        double custoFabrica, porcentDistribuidor, imposto, precoCarNovo;
        try(Scanner entrada = new Scanner(System.in)){
            System.out.println("Qual preço de fábrica? ");
            custoFabrica = entrada.nextFloat();
        }
        porcentDistribuidor = (custoFabrica * 0.28);
        imposto = (custoFabrica * 0.45);

        precoCarNovo = (custoFabrica + porcentDistribuidor + imposto);

        System.out.println("O preço final do carro é: "+ precoCarNovo);
    }

}
