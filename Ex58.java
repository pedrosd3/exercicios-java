import java.util.Scanner;

//Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//         Até 5 Kg      Acima de 5 Kg
//Morango  R$ 2,50 por   Kg R$ 2,20 por Kg
//Maçã     R$ 1,80 por   Kg R$ 1,50 por Kg
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
//ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
//morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

public class Ex58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantos kgs de morango quer comprar?");
        double morango = sc.nextDouble();

        System.out.println("Quantos kgs de maçã quer comprar?");
        double maca = sc.nextDouble();

        if (morango <= 5) {
            double precoMorango = morango * 2.5;
        } else {
            double precoMorango = morango * 2.2;
        }

        if (maca <= 5) {
            double precoMaca = morango * 1.8;
        } else {
            double precoMaca = morango * 1.5;
        }
    }
}
