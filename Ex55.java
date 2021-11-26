import java.util.Scanner;

//início
//    ler x
//    ler y
//    z <= (x*y) + 5
//    se z <= 0 então
//      resposta <= ‘A’
//    senão
//      se z <= 100 então
//          resposta <= ‘B’
//      senão
//          resposta <= ‘C’
//      fim_se
//     fim_se
//     escrever z, resposta
//fim
//Faça um teste de mesa e complete o quadro a seguir para os seguintes valores:
//Variáveis
//X    Y    Z    Resposta
//3    2
//150  3
//7   -1
//-2   5
//50   3

public class Ex55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor de X");
        int x = sc.nextInt();

        System.out.println("Digite o valor de Y");
        int y = sc.nextInt();

        int z =(x * y) + 5;

        if (z <= 0) {
            System.out.println("A");
        } else if (z <= 100) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
