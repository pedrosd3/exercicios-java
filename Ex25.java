import java.util.Scanner;

//Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na
//utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D,
//devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim
//C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de
//multiplicação e apresentar doze resultados de saída.

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor do 1° número :");
        int valorA = sc.nextInt();

        System.out.println("Digite o valor do 2° número :");
        int valorB = sc.nextInt();

        System.out.println("Digite o valor do 3° número :");
        int valorC = sc.nextInt();

        System.out.println("Digite o valor do 4° número :");
        int valorD = sc.nextInt();

        int somaAB = valorA + valorB;
        int somaAC = valorA + valorC;
        int somaAD = valorA + valorD;
        int somaBC = valorB + valorC;
        int somaBD = valorB + valorD;
        int somaCD = valorC + valorD;

        int multAB = valorA * valorB;
        int multAC = valorA * valorC;
        int multAD = valorA * valorD;
        int multBC = valorB * valorC;
        int multBD = valorB * valorD;
        int multCD = valorC * valorD;

        System.out.println("A soma entre A e B é " + somaAB);
        System.out.println("A soma entre A e C é " + somaAC);
        System.out.println("A soma entre A e D é " + somaAD);
        System.out.println("A soma entre B e C é " + somaBC);
        System.out.println("A soma entre B e D é " + somaBD);
        System.out.println("A soma entre C e D é " + somaCD);

        System.out.println("A multiplicação entre A e B é " + multAB);
        System.out.println("A multiplicação entre A e C é " + multAC);
        System.out.println("A multiplicação entre A e D é " + multAD);
        System.out.println("A multiplicação entre B e C é " + multBC);
        System.out.println("A multiplicação entre B e D é " + multBD);
        System.out.println("A multiplicação entre C e D é " + multCD);

        sc.close();
    }
}
