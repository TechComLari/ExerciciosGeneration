package ExerciciosGeneration.LacosCondicionais;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        //2- Faça um programa que entre com três números e coloque em ordem crescente.

        int n1 , n2 , n3, cont;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe 1 número:\n");
        n1 = entrada.nextInt();
        System.out.println("Informe 2 número:\n");
        n2 = entrada.nextInt();
        System.out.println("Informe 3 número:\n");
        n3 = entrada.nextInt();

        if(n1 > n2){
            //estrutura faz a troca dos valores:
            cont = n2;
            n2 = n1;
            n1 = cont;
            System.out.println("cont1:" + cont);
        }
        System.out.println("cont1:" + n2 +" "+ n1);

        if(n1 > n3) {
            cont = n3;
            n3 = n1;
            n1 = cont;
            System.out.println("cont2:" + cont);
        }
        System.out.println("cont2:" + n3 +" "+ n1);

        if(n2 > n3){
            cont = n3;
            n3 = n2;
            n2 = cont;
            System.out.println("cont3:" + cont);
        }
        System.out.println("cont3:" + n3 +" "+ n1);
        //mostrando números em ordem crescente:
        System.out.println("Em ordem crescente: "+ n1+" "+n2+" "+n3);
    }

}