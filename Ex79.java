import java.util.Scanner;

//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
//1 até 500.

public class Ex79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int valorA = 1;
        int valorB = 3;

        int cont = 1;

        while (cont < 250) {
            int result = valorA + valorB;
            valorA = result;
            valorB = valorB + 2;
            cont = cont + 1;
            System.out.println(result);
        }
    }
}
