import java.util.Scanner;

//Faça um algoritmo que peça base e altura de um retângulo e mostre como resultado sua área

public class Ex7 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a base do retângulo :");
        int base = sc.nextInt();

        System.out.println("digite a altura do retângulo :");
        int altura = sc.nextInt();

        int area = base * altura;
        System.out.print("A área do retângulo é :" + area);

        sc.close();
    }
}
