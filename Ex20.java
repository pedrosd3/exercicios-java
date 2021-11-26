import java.util.Scanner;

//Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de
//conversão é C ← (F - 32) * (5/9) , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

public class Ex20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor da temperatura em graus fahrenheit :");
        float fahrenheit = sc.nextFloat();

        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("O valor em graus celsius é de " + celsius + "C°");

        sc.close();
    }

}
