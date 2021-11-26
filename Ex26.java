import java.util.Scanner;

//Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
//VOLUME ← COMPRIMENTO * LARGURA * ALTURA.

public class Ex26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o comprimento da caixa :");
        float comprimento = sc.nextFloat();

        System.out.println("Digite o altura da caixa :");
        float altura = sc.nextFloat();

        System.out.println("Digite o largura da caixa :");
        float largura = sc.nextFloat();

        float volume = comprimento * altura * largura;
        System.out.println("O volume da caixa é " + volume);

        sc.close();
    }

}
