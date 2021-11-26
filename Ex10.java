import java.util.Scanner;

//Faça um algoritmo que peça o lado de um quadrado e mostre como resultado sua área

public class Ex10 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do lado do quadrado :");
        int lado = sc.nextInt();

        int area = lado * lado;
        System.out.print("A área do quadrado é :" + area);

        sc.close();
    }
}