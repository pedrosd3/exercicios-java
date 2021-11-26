import java.util.Scanner;

//Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

public class Ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do 1° valor");
        int valor1 = sc.nextInt();

        System.out.println("Digite o valor do 2° valor");
        int valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("1° valor é maior");
        } else if (valor2 > valor1) {
            System.out.println("2° valor é maior");
        } else {
            System.out.println("Os valores são iguais");
        }
    }
}
