import java.util.Scanner;

//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário.

public class Ex14 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner (System.in);
        double salario_mensal, percentual, salario_reajustado;

        System.out.println("Digite seu salário :");
        salario_mensal = teclado.nextDouble();

        System.out.println("Informe o percentual de reajuste :");
        percentual = teclado.nextDouble();

        salario_reajustado = salario_mensal + ((percentual / 100) * salario_mensal);

        System.out.printf("O valor do salário reajustado é R$ %.2f" , salario_reajustado);

        teclado.close();
    }
}
