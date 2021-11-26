import java.util.Scanner;

//Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o
//quadrado da soma dos três valores lidos.

public class Ex31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do 1° número :");
        int a = sc.nextInt();

        System.out.println("Digite o valor do 2° número :");
        int b = sc.nextInt();

        System.out.println("Digite o valor do 3° número :");
        int c = sc.nextInt();

        double soma = Math.pow(a + b + c, 2);
        System.out.println("O valor da equação é " + soma);

        sc.close();
    }

}
