import java.util.Scanner;

// Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
//correspondente em graus Celsius (baseado na fórmula abaixo):
//     C        F - 32
// -------- = ---------
//     5          9

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a temperatura em graus fahrenheit :");
        float fahrenheit = sc.nextFloat();

        float celsius = ((fahrenheit - 32) / 9) * 5;
        System.out.println("O valor recebido convertido para graus celsius é " + celsius + "C°");

        sc.close();
    }
}
