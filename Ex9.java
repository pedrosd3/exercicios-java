import java.util.Scanner;

//Faça um algoritmo que peça o raio de um círculo e mostre como resultado sua área

public class Ex9 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do raio do círculo :");
        int raio = sc.nextInt();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.print("A área do círculo é :" + area);

        sc.close();
    }
}