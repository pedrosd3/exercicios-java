import java.util.Scanner;

//Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
//apresentação, caso o valor não seja maior que três.

public class Ex75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um valor inteiro");
        int valor = sc.nextInt();

        if (valor <= 3) {
            System.out.println(valor);
        }
    }
}
