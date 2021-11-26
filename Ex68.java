import java.util.Scanner;

//Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
//dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da
//média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média.
//Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi
//aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta
//condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição.

public class Ex68 {
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

        if (media >= 7) {
            System.out.println("Você foi aprovado, sua média foi " + media);
        } else{
            System.out.println("Digite a nota da prova de recuperação");
            double nota5 = sc.nextDouble();

            double mediaNova = media + nota5 / 4;

            if (mediaNova >= 5) {
                System.out.println("Você foi aprovado, sua média foi " + mediaNova);
            } else {
                System.out.println("Você foi reprovado");
            }
        }
    }
}
