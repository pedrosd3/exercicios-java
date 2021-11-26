import java.util.Scanner;

//Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à
//soma dos quadrados dos três valores lidos.

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do 1° número");
        int a = sc.nextInt();

        System.out.println("Digite o valor do 2° número");
        int b = sc.nextInt();

        System.out.println("Digite o valor do 3° número");
        int c = sc.nextInt();

        double aa = Math.pow(a, 2);
        double bb = Math.pow(b, 2);
        double cc = Math.pow(c, 2);

        double soma = aa + bb + cc;
        System.out.println("O valor da equação é " + soma);

        sc.close();
    }
}
