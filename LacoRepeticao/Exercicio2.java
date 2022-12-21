package ExerciciosGeneration.LacoRepeticao;

public class Exercicio2 {
        public static void main(String[] args) {
    // Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
    int numero, contPar = 0, contImpar = 0;

    for(numero = 0; numero < 10; numero++){

        if(numero % 2 == 0) {
            contPar++;
        }else{
            contImpar++;
        }
    }
    System.out.println("\nQtd números pares: "+ contPar);

    System.out.println("\nQtd números ímpares: "+ contImpar);
}

}
