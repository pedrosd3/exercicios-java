import java.util.Scanner;

//Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de
//Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza
//pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo
//valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo
//é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.

public class Ex83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int valorA = 1;
        int valorB = 1;

        int cont = 1;

        while (cont <= 15) {
            int result = valorA + valorB;
            valorB = valorA;
            valorA = result;
            cont = cont + 1;
            System.out.println(result);
        }
    }
}
