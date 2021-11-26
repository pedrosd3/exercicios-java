import java.util.Scanner;

//Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
//PRESTACAO ← VALOR + (VALOR * TAXA/100) * TEMPO).

public class Ex23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor da dívida :");
        float divida = sc.nextFloat();

        System.out.println("Digite o valor do júros da dívida :");
        float juros = sc.nextFloat();

        System.out.println("Digite o tempo da dívida :");
        int tempo = sc.nextInt();

        float prestacao = divida + (divida * juros / 100) * tempo;
        System.out.println("O valor da dívida agora é de R$" + prestacao);

        sc.close();
    }

}