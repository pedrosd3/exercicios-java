import java.util.Scanner;

//Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

public class Ex77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor da tabuada");
        int tabuada = sc.nextInt();

        int cont = 1;

        while (cont <= 10) {
            int valor = tabuada * cont;
            System.out.println(tabuada + "*" + cont + "=" + valor);
            cont += 1;
        }
    }
}
