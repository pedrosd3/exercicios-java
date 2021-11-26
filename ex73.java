import java.util.Scanner;

//Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem
//informando se o número é par ou ímpar.

public class ex73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número inteiro");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número informado é par");
        } else {
            System.out.println("O número informado é ímpar");
        }
    }
}
