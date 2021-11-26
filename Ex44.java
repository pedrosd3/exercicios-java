import java.util.Scanner;

//Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
//quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
//média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
//a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
//compra'.

public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a quantidade atual no estoque");
        int atual = sc.nextInt();

        System.out.println("Digite a quantidade máxima do estoque");
        int maxima = sc.nextInt();

        System.out.println("Digite s quantidade mínima do estoque");
        int minima = sc.nextInt();

        double media = (maxima + minima) / 2;

        if (atual >= media) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
