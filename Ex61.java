import java.util.Scanner;

//Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário.
//Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total
//a pagar (total a pagar = total - desconto), sabendo-se que:
// - Se quantidade <= 5 o desconto será de 2%
// - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
// - Se quantidade > 10 o desconto será de 5%

public class Ex61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o nome do produto");
        String nome = sc.next();

        System.out.println("Digite a quantidade adquirida do produto");
        int qtd = sc.nextInt();

        System.out.println("Digite o preço unitário pago pelo produto");
        double preco = sc.nextDouble();

        double total = qtd * preco;

        if (qtd <= 5) {
            double desconto = total / 100 * 98;
            System.out.println("O preço final com desconto aplicado será de R$ " + desconto);
        } else if (qtd > 5 && qtd <= 10) {
            double desconto = total / 100 * 97;
            System.out.println("O preço final com desconto aplicado será de R$ " + desconto);
        } else if (qtd > 10) {
            double desconto = total / 100 * 95;
            System.out.println("O preço final com desconto aplicado será de R$ " + desconto);
        }
    }
}
