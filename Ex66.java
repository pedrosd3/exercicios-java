import java.util.Scanner;

//Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um
//valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se
//de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.

public class Ex66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Difite um número, positivo ou negativo");
        int valor = sc.nextInt();

        if (valor < 0) {
            int result = valor * -1;
            System.out.println("O módulo é " + result);
        } else if (valor > 0) {
            int result = valor * 1;
            System.out.println("O módulo é " + result);
        } else {
            System.out.println("O valor digitado doi 0");
        }
    }
}
