import java.util.Scanner;

//Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.

public class Ex71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor da 1° nota");
        int nota1 = sc.nextInt();

        System.out.println("Digite o valor da 2° nota");
        int nota2 = sc.nextInt();

        System.out.println("Digite o valor da 3° nota");
        int nota3 = sc.nextInt();

        System.out.println("Digite o valor da 4° nota");
        int nota4 = sc.nextInt();

        if (nota1 % 2 == 0) {
            System.out.println(nota1 + " é divisível por 2");
        }
        if (nota1 % 3 == 0) {
            System.out.println(nota1 + " é divisível por 3");
        }

        if (nota2 % 2 == 0) {
            System.out.println(nota2 + " é divisível por 2");
        }
        if (nota2 % 3 == 0) {
            System.out.println(nota2 + " é divisível por 3");
        }

        if (nota3 % 2 == 0) {
            System.out.println(nota3 + " é divisível por 2");
        }
        if (nota3 % 3 == 0) {
            System.out.println(nota3 + " é divisível por 3");
        }

        if (nota4 % 2 == 0) {
            System.out.println(nota4 + " é divisível por 2");
        }
        if (nota4 % 3 == 0) {
            System.out.println(nota4 + " é divisível por 3");
        }
    }
}
