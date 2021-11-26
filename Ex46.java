import java.util.Scanner;

//Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do
//percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).

public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu salário mensal");
        double salarioMensal = sc.nextDouble();

        System.out.println("Digite o percentual de reajuste de seu salário");
        double reajuste = sc.nextDouble();

        double salarioNovo = salarioMensal + (salarioMensal / 100) * reajuste;
        System.out.println("Com o reajuste aplicado, seu salário novo será de R$ " + salarioNovo);
    }
}
