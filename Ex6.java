import java.util.Scanner;

//Peça ao usuário um número e mostre a ele seu sucessor

public class Ex6 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um númeor aqui :");
        int valor = sc.nextInt();

        int sucessor = valor + 1;
        System.out.print("O sucessor do valor digitado é :" + sucessor);

        sc.close();
    }
}