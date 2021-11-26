import java.util.Scanner;

//Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
//ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
//dos outros 2 lados.

public class Ex52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do lado A");
        double ladoA = sc.nextDouble();

        System.out.println("Digite o valor do lado B");
        double ladoB = sc.nextDouble();

        System.out.println("Digite o valor do lado C");
        double ladoC = sc.nextDouble();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            System.out.println("É possível formar um triângulo");
        } else {
            System.out.println("Não é possível formar um triângulo");
        }
    }
}
