import java.util.Scanner;

//Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
//poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o ano em que você nasceu");
        int anoNascimento = sc.nextInt();

        System.out.println("Digite o ano atual");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Você pode votar");
        } else {
            System.out.println("Você não pode votar");
        }
    }
}
