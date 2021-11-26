import java.util.Scanner;

//Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em
//real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível
//com o usuário, para que seja apresentado o valor em moeda americana.

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Diga a cotação do dólar hoje :");
        float cotacao = sc.nextFloat();

        System.out.println("Diga a quantidade de reais que possui :");
        float quantia = sc.nextFloat();

        float dolar = quantia / cotacao;
        System.out.println("De acordo com a contação atual, você possui $" + dolar);

        sc.close();
    }
}
