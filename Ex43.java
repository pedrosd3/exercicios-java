import java.util.Scanner;

//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
//escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
//ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

public class Ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu saldo bancário");
        double saldo = sc.nextDouble();

        System.out.println("Digite o valor de débito");
        double debito = sc.nextDouble();

        System.out.println("Digite o crédito disponível");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        if (saldoAtual >= 0) {
            System.out.println("Seu saldo é positivo");
        } else {
            System.out.println("Seu saldo é negativo");
        }
    }
}
