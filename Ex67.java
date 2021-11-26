import java.util.Scanner;

//Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
//dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não
//foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o
//valor da média do aluno para qualquer condição.

public class Ex67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor da 1° nota");
        double nota1 = sc.nextDouble();

        System.out.println("Digite o valor da 2° nota");
        double nota2 = sc.nextDouble();

        System.out.println("Digite o valor da 3° nota");
        double nota3 = sc.nextDouble();

        System.out.println("Digite o valor da 4° nota");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 5) {
            System.out.println("Você foi aprovado, sua média foi " + media);
        } else {
            System.out.println("Você foi aprovado, sua média foi " + media);
        }
    }
}
