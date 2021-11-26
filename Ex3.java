import java.util.Scanner;

//Peça ao usuário dois valores e realize a multiplicação

public class Ex3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do primeiro número :");
        int valor01 = sc.nextInt();

        System.out.println("Digite o valor do primeiro número :");
        int valor02 = sc.nextInt();

        int multiplicacao = valor01 * valor02;
        System.out.print("O valor da multiplicação é :" + multiplicacao);

        sc.close();
    }
}
