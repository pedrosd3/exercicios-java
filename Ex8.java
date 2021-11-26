import java.util.Scanner;

//Faça um algoritmo que peça base e altura de um triângulo e mostre como resultado sua área

public class Ex8 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a base do triângulo :");
        int base = sc.nextInt();

        System.out.println("digite a altura do triângulo :");
        int altura = sc.nextInt();

        int area = (base * altura) / 2;
        System.out.print("A área do triângulo é :" + area);

        sc.close();
    }
}