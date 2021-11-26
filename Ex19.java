import java.util.Scanner;

//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
//conversão é F ← (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

public class Ex19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor em graus celsius :");
        float celsius = sc.nextFloat();

        float fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("O valor convertido para graus fahrenhit é de " + fahrenheit + "C°");

        sc.close();
    }

}
