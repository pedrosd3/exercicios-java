import java.util.Scanner;

//Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.

public class Ex70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do 1° número");
        int valorA = sc.nextInt();

        System.out.println("Digite o valor do 2° número");
        int valorB = sc.nextInt();

        System.out.println("Digite o valor do 3° número");
        int valorC = sc.nextInt();

        if (valorA < valorB && valorB < valorC) {
            System.out.println("A sequência em ordem crescente é " + valorA + "," + valorB + "," + valorC);
        } else if ( valorA < valorC && valorC < valorB) {
            System.out.println("A sequência em ordem crescente é " + valorA + "," + valorC + "," + valorB);
        } else if ( valorB < valorC && valorC < valorA) {
            System.out.println("A sequência em ordem crescente é " + valorB + "," + valorC + "," + valorA);
        } else if ( valorB < valorA && valorA < valorC) {
            System.out.println("A sequência em ordem crescente é " + valorB + "," + valorA + "," + valorC);
        } else if ( valorC < valorA && valorA < valorB) {
            System.out.println("A sequência em ordem crescente é " + valorC + "," + valorA + "," + valorB);
        } else if ( valorC < valorB && valorB < valorA) {
            System.out.println("A sequência em ordem crescente é " + valorC + "," + valorB + "," + valorA);
        }
    }
}
