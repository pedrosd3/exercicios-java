import java.util.Scanner;

//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//Álcool
//até 20 litros, desconto de 3% por litro
//acima de 20 litros, desconto de 5% por litro

//Gasolina
//até 20 litros, desconto de 4% por litro
//acima de 20 litros, desconto de 6% por litro

//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
//seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
//que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.

public class Ex56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Como vai abastecer? Digite '1' para gasolina e '2' para álcool");
        int combustivel = sc.nextInt();

        if (combustivel == 1) {
            System.out.println("Digite a quantidade de gasolina que deseja abastecer");
            double qtd = sc.nextDouble();

            if (qtd <= 20) {
                double valor = (3.3 * qtd) / 100 * 97;
                System.out.println("O valor final será R$ " + valor);
            } else {
                double valor = (3.3 * qtd) / 100 * 95;
                System.out.println("O valor final será R$ " + valor);
            }
        }
        if (combustivel == 2) {
            System.out.println("Digite a quantidade de álcool que deseja abastecer");
            double qtd = sc.nextDouble();

            if (qtd <= 20) {
                double valor = (2.9 * qtd) / 100 * 96;
                System.out.println("O valor final será R$ " + valor);
            } else {
                double valor = (2.9 * qtd) / 100 * 94;
                System.out.println("O valor final será R$ " + valor);
            }
        }
    }
}
