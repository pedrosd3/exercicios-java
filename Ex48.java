import java.util.Scanner;

// Ler um valor e escrever se é positivo, negativo ou zero.

public class Ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um valor qualquer");
        int valor = sc.nextInt();

        if (valor > 0) {
            System.out.println("Valor positivo");
        } else if (valor == 0) {
            System.out.println("Valor igual a zero");
        } else {
            System.out.println("Valor negativo");
        }
    }
}
