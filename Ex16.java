import java.util.Scanner;

//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
//mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
//efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
//vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
//vendedor.

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o salário fixo do funcionário");
        float salarioFixo = sc.nextFloat();

        System.out.println("Digite a quantidade de carros vendidos no mês pelo vendedor");
        int carrosVendidos = sc.nextInt();

        System.out.println("Digite o valor da comissão por carro vendido");
        float comissao = sc.nextFloat();

        System.out.println("Digite o valor total de carros vendidos no mês");
        float valorTotal = sc.nextFloat();

        float total = salarioFixo + (carrosVendidos * comissao) + ((valorTotal / 100) * 5);
        System.out.println("O salário total do vendedor no final do mês será de R$" + total);

        sc.close();
    }
}
