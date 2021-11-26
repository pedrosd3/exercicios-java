import java.util.Scanner;

//Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

public class Ex78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int valorA = 1;
        int valorB = 2;
        int cont = 1;

        while (cont < 100) {
            int result = valorA + valorB;
            valorA = result;
            valorB = valorB + 1;
            cont = cont + 1;
            System.out.println(result);
        }
    }
}
