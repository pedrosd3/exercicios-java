import java.util.Scanner;

//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
//Volume = Raio² ** Altura

public class Ex21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do raio da lata :");
        double raio = sc.nextDouble();

        System.out.println("Digite o valor do altura da lata :");
        double altura = sc.nextDouble();

        double volume = Math.PI * (raio * 2) * altura;
        System.out.println("O volume da lata de óleo é de :" + volume);

        sc.close();
    }

}
