import java.util.Scanner;

//Peça ao usuário dois valores e realize a divisão

public class Ex4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do primeiro número :");
        int valor01 = sc.nextInt();

        System.out.println("Digite o valor do segundo número :");
        int valor02 = sc.nextInt();

        int divisao = valor01 / valor02;
        System.out.print("O resultado da divisão é :" + divisao);

        sc.close();
    }
}
