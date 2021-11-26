import java.util.Scanner;

//Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
//crescente.

public class Ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do 1° número");
        int valorA = sc.nextInt();

        System.out.println("Digite o valor do 2° número");
        int valorB = sc.nextInt();

        System.out.println("Digite o valor do 3° número");
        int valorC = sc.nextInt();

        if (valorA > valorB && valorB > valorC) {
            System.out.println("A sequência dos valores em ordem crescente " + valorC + "," + valorB + "," + valorA);
        } else if (valorA > valorC && valorC > valorB) {
            System.out.println("A sequência dos valores em ordem crescente " + valorB + "," + valorC + "," + valorA);
        } else if (valorB > valorC && valorC > valorA) {
            System.out.println("A sequência dos valores em ordem crescente " + valorA + "," + valorC + "," + valorB);
        } else if (valorB > valorA && valorA > valorC) {
            System.out.println("A sequência dos valores em ordem crescente " + valorC + "," + valorA + "," + valorB);
        } else if (valorC > valorA && valorA > valorB) {
            System.out.println("A sequência dos valores em ordem crescente " + valorB + "," + valorA + "," + valorC);
        } else if (valorC > valorB && valorB > valorA) {
            System.out.println("A sequência dos valores em ordem crescente " + valorA + "," + valorB + "," + valorC);
        }
    }
}
