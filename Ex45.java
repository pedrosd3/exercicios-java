import java.util.Scanner;

//Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e D).
// Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro
//valor, e o resultado da soma (variável S) do segundo com o quarto valor.

public class Ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o 1° valor");
        int a = sc.nextInt();

        System.out.println("Digite o 2° valor");
        int b = sc.nextInt();

        System.out.println("Digite o 3° valor");
        int c = sc.nextInt();

        System.out.println("Digite o 4° valor");
        int d = sc.nextInt();

        int p = a * c;
        int s = b + d;

        System.out.println("O produto do primeiro com o terceiro valor é " + p);
        System.out.println("A soma do segunda com o quarto valor é " + s);
    }
}
