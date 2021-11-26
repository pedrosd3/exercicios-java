import java.util.Scanner;

//Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
//Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
//final é:
//               n1 * 2 + n2 * 3 + n3 * 5
// mediafinal = --------------------------
//                          10

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor da 1° nota :");
        float nota1 = sc.nextFloat();

        System.out.println("Digite o valor da 2° nota :");
        float nota2 = sc.nextFloat();

        System.out.println("Digite o valor da 3° nota :");
        float nota3 = sc.nextFloat();

        float media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        System.out.println("Com base nas notas, a média final foi de " + media);

        sc.close();
    }
}
