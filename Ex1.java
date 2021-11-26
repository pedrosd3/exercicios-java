import java.util.Scanner;

//Peça ao usuário dois valores e realize a soma

public class Ex1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do primeiro número :");
        int valor01 = sc.nextInt();

        System.out.println("Digite o valor do segundo número :");
        int valor02 = sc.nextInt();

        int soma = valor01 + valor02;
        System.out.print("O valor da soma é :" + soma);

        sc.close();
    }
}
