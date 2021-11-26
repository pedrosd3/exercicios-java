import java.util.Scanner;

//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
//dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
//das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
//novo com a mulher mais velha.

public class Ex57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a idade do 1° homem");
        int homem1 = sc.nextInt();

        System.out.println("Digite a idade do 2° homem");
        int homem2 = sc.nextInt();

        System.out.println("Digite a idade da 1° mulher");
        int mulher1 = sc.nextInt();

        System.out.println("Digite a idade da 2° mulher");
        int mulher2 = sc.nextInt();

        if (homem1 > homem2 && mulher1 < mulher2) {
            int soma = homem1 + mulher1;
            int produto = homem2 * mulher2;
            System.out.println("A soma da equação é " + soma + " e a produto da equação é " + produto);
        } else if (homem1 > homem2 && mulher2 < mulher1) {
            int soma = homem1 + mulher2;
            int produto = homem2 * mulher1;
            System.out.println("A soma da equação é " + soma + " e a produto da equação é " + produto);
        } else if (homem2 > homem1 && mulher1 < mulher2) {
            int soma = homem2 + mulher1;
            int produto = homem1 * mulher2;
            System.out.println("A soma da equação é " + soma + " e a produto da equação é " + produto);
        } else if (homem2 > homem1 && mulher2 > mulher1) {
            int soma = homem2 + mulher2;
            int produto = homem1 * mulher1;
            System.out.println("A soma da equação é " + soma + " e a produto da equação é " + produto);
        }
    }
}
