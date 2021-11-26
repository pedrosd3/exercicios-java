import java.util.Scanner;

//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
//maiores.

public class Ex50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do 1° número");
        int valorA = sc.nextInt();

        System.out.println("Digite o valor do 2° número");
        int valorB = sc.nextInt();

        System.out.println("Digite o valor do 3° número");
        int valorC = sc.nextInt();

        if (valorA > valorC && valorB > valorC) {
            int soma = valorA + valorB;
            System.out.println("A soma dos valores é " + soma);
        } else if (valorA > valorB && valorC > valorB) {
            int soma = valorA + valorC;
            System.out.println("A soma dos valores é " + soma);
        } else if (valorB > valorA && valorC > valorA) {
            int soma = valorB + valorC;
            System.out.println("A soma dos valores é " + soma);
        } else {
            System.out.println("Valores inválidos");
        }
    }
}

