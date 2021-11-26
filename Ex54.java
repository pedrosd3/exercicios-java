import java.util.Scanner;

//Ler dois valores e imprimir uma das três mensagens a seguir:
//‘Números iguais’, caso os números sejam iguais
//‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
//‘Segundo maior’, caso o segundo seja maior que o primeiro.

public class Ex54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do 1° número");
        int valorA = sc.nextInt();

        System.out.println("Digite o valor do 2° número");
        int valorB = sc.nextInt();

        if (valorA > valorB) {
            System.out.println("1° valor é o maior");
        } else if (valorB > valorA) {
            System.out.println("2° valor é o maior");
        } else {
            System.out.println("Números iguais");
        }
    }
}
