import java.util.Scanner;

//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
//de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
//o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
//(considere que o mês possua 4 semanas exatas).

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a quantiadade de horas trabalhadas na semana");
        double horasTrabalhadas = sc.nextInt();

        System.out.println("Digite seu salário por hora");
        double salarioHora = sc.nextInt();

        if ( horasTrabalhadas > 40) {
            double difernca = horasTrabalhadas - 40;
            double salarioFinal = ((salarioHora * 40) + (difernca * ((salarioHora / 100) * 150))) * 4;
            System.out.println("Seu salário no final do mês foi de R$" + salarioFinal);
        } else {
            double salarioFinal = horasTrabalhadas * salarioHora * 4;
            System.out.println("Seu salário no final do mês foi de R$" + salarioFinal);
        }
    }
}
