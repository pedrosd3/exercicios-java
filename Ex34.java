import java.util.Scanner;

//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
//compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
//escreva o custo total da compra.

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a quantidade de maçãs compradas :");
        int maca = sc.nextInt();

        if (maca < 12) {
            double valor = maca * 1.3;
            System.out.println("O valor final é R$" + valor);
        } else {
            double valor = maca * 1;
            System.out.println("O valor final é R$" + valor);
        }
    }
}
