import java.util.Scanner;

//Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.

public class Ex72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o número");
        int a = sc.nextInt();

        System.out.println("Digite o número");
        int b = sc.nextInt();

        System.out.println("Digite o número");
        int c = sc.nextInt();

        System.out.println("Digite o número");
        int d = sc.nextInt();

        System.out.println("Digite o número");
        int e = sc.nextInt();

        if (a > b && a > c && a > d && a > e) {
            System.out.println("O maior número é " + a);
        } else if (b > a && b > c && b > d && b > e) {
            System.out.println("O maior número é " + b);
        } else if (c > a && c > b && c > d && c > e) {
            System.out.println("O maior número é " + c);
        } else if (d > a && d > b && d > c && d > e) {
            System.out.println("O maior número é " + d);
        } else if (e > a && e > b && e > c && e > d) {
            System.out.println("O maior número é " + e);
        }
        if (a < b && a < c && a < d && a < e) {
            System.out.println("O menor número é " + a);
        } else if (b < a && b < c && b < d && b < e) {
            System.out.println("O menor número é " + b);
        } else if (c < a && c < b && c < d && c < e) {
            System.out.println("O menor número é " + c);
        } else if (d < a && d < b && d < c && d < e) {
            System.out.println("O menor número é " + d);
        } else if (e < a && e < b && e < c && e < d) {
            System.out.println("O menor número é " + e);
        }
    }
}
