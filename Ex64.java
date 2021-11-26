import java.util.Scanner;

//Seja o seguinte algoritmo:
//inicio
//      ler a, b, c
//      se (a < b+c) e (b <a+c) e (c <a+b) então
//          se (a=b) e (b=c) então
//              mens <= 'Triângulo Equilátero'
//          senão
//              se (a=b) ou (b=c) ou (a=c) então
//                  mens <= 'Triângulo Isósceles'
//              senão
//                  mens <= 'Triângulo Escaleno'
//              fim_se
//          fim_se
//      senão
//          mens <= 'Não e possível formar um triângulo'
//      fim_se
//      escrever mens
//fim
//Faça um teste de mesa e complete o quadro a seguir para os seguintes valores das variáveis:
//      Variáveis
//A B C Mens
//1 2 3 Não é possível formar um triângulo
//3 4 5 Triângulo Escaleno
//2 2 4 Não é possível formar um triângulo
//4 4 4 Triângulo Equilátero
//5 3 3 Triângulo Isósceles

public class Ex64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor de A");
        int valorA = sc.nextInt();

        System.out.println("Digite o valor de B");
        int valorB = sc.nextInt();

        System.out.println("Digite o valor de C");
        int valorC = sc.nextInt();

        if ((valorA < valorB + valorC) && (valorB < valorA + valorC) && (valorC < valorA + valorB)) {
            if ((valorA == valorB) && (valorB == valorA)) {
                System.out.println("Triângulo Equilátero");
            } else {
                if ((valorA == valorB) || (valorB == valorC) || (valorA == valorC)) {
                    System.out.println("Triângulo Isósceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            }
        } else {
            System.out.println("Não e possível formar um triângulo");
        }
    }
}
