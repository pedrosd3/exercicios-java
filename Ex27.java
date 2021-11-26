import java.util.Scanner;

//Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo
//segundo.

public class Ex27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um valor inteiro :");
        int a = sc.nextInt();

        System.out.println("Digite outro valor inteiro :");
        int b = sc.nextInt();

        double result = Math.pow(a - b, 2);
        System.out.println("O resultado da diferença entre os dois valores ao quadrado é " + result);

        sc.close();
    }
}

