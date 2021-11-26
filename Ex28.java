import java.util.Scanner;

//Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em
//dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
//disponível com o usuário, para que seja apresentado o valor em moeda brasileira.

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Diga a cotação do dólar hoje :");
        float cotacao = sc.nextFloat();

        System.out.println("Diga a quantidade de dólares que possui :");
        float quantia = sc.nextFloat();

        float real = cotacao * quantia;
        System.out.println("De acordo com a contação atual, você possui R$" + real);

        sc.close();
    }
}
