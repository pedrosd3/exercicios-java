import java.util.Scanner;

//Peça ao usuário um número e mostre a ele seu antecessor

public class Ex5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número qualquer :");
        int valor = sc.nextInt();

        int antecessor = valor - 1;
        System.out.print("O sucessor do valor digitado é :" + antecessor);

        sc.close();
    }
}

