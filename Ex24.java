import java.util.Scanner;

//Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de
//forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da
//variável A. Apresentar os valores trocados.

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor de A :");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B :");
        int b = sc.nextInt();

        int auxiliar = a;

        a = b;
        b = auxiliar;

        System.out.println(a);
        System.out.println(auxiliar);

        sc.close();
    }
}
