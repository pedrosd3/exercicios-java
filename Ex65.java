import java.util.Scanner;

//Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.

public class Ex65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um valor inteiro");
        int valorA = sc.nextInt();

        System.out.println("Digite um outro inteiro");
        int valorB = sc.nextInt();

        if (valorA > valorB) {
            int sub = valorA - valorB;
            System.out.println("O resulatado da equação é " + sub);
        } else if (valorB > valorA) {
            int sub = valorB - valorA;
            System.out.println("O resultado da equação é " + sub);
        } else {
            System.out.println("Os valores digitados são iguais");
        }
    }
}
