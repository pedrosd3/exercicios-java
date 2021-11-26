import java.util.Scanner;

//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores.

public class Ex13 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o número de votos brancos :");
        double brancos = sc.nextDouble();

        System.out.println("Digite o número de votos nulos :");
        double nulos = sc.nextDouble();

        System.out.println("Digite o número de votos válidos");
        double validos = sc.nextDouble();

        double total = brancos + nulos + validos;
        double porcentagemBrancos = (brancos / total) * 100;
        double porcentagemNulos = (nulos / total) * 100;
        double porcentagemValidos = (validos / total) * 100;

        System.out.println("O total de votos foi de :" + total);
        System.out.println("A porcentagem de votos brancos foi de : " + porcentagemBrancos + "%");
        System.out.println("A porcentagem de votos nulos foi de : " + porcentagemNulos + "%");
        System.out.println("A porcentagem de votos válidos foi de : " + porcentagemValidos + "%");

        sc.close();
    }
}