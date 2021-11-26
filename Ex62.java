import java.util.Scanner;

//Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
//exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
//e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:
//                                N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios
//Média_de_Aproveitamento = ---------------------------------------------------------
//                                                  7
//A atribuição de conceitos obedece a tabela abaixo:
//Média de Aproveitamento   Conceito
//   > = 9,0                    A
//   > = 7,5 e < 9,0            B
//   > = 6,0 e < 7,5            C
//   < 6,0                      D

public class Ex62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor da 1° nota");
        double nota1 = sc.nextDouble();

        System.out.println("Digite o valor da 2° nota");
        double nota2 = sc.nextDouble();

        System.out.println("Digite o valor da 3° nota");
        double nota3 = sc.nextDouble();

        double media = (nota1 + (nota2 * 2) + (nota3 * 3) + (nota1 + nota2 + nota3 / 3)) / 7;

        if (media >= 9) {
            System.out.println("Sua nota foi A");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Sua nota foi B");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Sua média foi C");
        } else {
            System.out.println("Sua média foi D");
        }
    }
}
