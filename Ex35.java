import java.util.Scanner;

// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
//aluno é aprovado). Escrever também a média calculada.

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor da 1° nota");
        double nota1 = sc.nextInt();

        System.out.println("Digite o valor da 2° nota");
        double nota2 = sc.nextInt();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Aprovado, sua média foi " + media);
        } else {
            System.out.println("Reprovado, sua média foi " + media);
        }
    }
}
