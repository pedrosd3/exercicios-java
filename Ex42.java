import java.util.Scanner;

//Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
//ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
//ultrapassar este valor, calcular e escrever o seu salário total.

public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o salário fixo");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite o valor total das vendas efetuadas");
        double valorVendas = sc.nextDouble();

        if (valorVendas <= 1500) {
            double salarioTotal = salarioFixo + (valorVendas / 100 * 3);
            System.out.println("Seu salário final foi R$" + salarioTotal);
        } else {
            double salarioTotal = salarioFixo + 45 + ((valorVendas - 1500) / 100 * 5);
            System.out.println("Seu salário final foi R$ " + salarioTotal);
        }
    }
}
