import java.util.Scanner;

//Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

public class Ex49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o 1° valor");
        int valor1 = sc.nextInt();

        System.out.println("Digite o 2° valor");
        int valor2 = sc.nextInt();

        System.out.println("Digite o 3° valor");
        int valor3 = sc.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O 1° valor digitado é o maior");
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O 2° valor digitado é o maior");
        } else if (valor3 > valor1 && valor3 > valor2) {
            System.out.println("O 3° valor digitado é o maior");
        } else {
            System.out.println("Valores digitados não correspondem com os esperados");
        }
    }
}
