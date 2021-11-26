import java.util.Scanner;

//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um valor positivo ou negativo :");
        int valor = sc.nextInt();

        if (valor >= 0){
            System.out.println("Valor positivo");
        } else {
            System.out.println("Valor negativo");
        }
    }
}
