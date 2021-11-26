import java.util.Scanner;

//Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
//contrário escrever NÃO É MAIOR QUE 10!

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um um número qualquer :");
        double valor = sc.nextDouble();

        if (valor <= 10) {
            System.out.println("Valor menor ou igual a 10");
        } else {
            System.out.println("Valor maior que 10");
        }

        sc.close();
    }
}
