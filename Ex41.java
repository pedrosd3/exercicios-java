import java.util.Scanner;

//Para o enunciado a seguir foi elaborado um algoritmo em Português Estruturado que contém
//erros, identifique os erros no algoritmo apresentado abaixo:
//Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule
//e mostre seu peso ideal, utilizando as seguintes fórmulas:
// - para sexo masculino: peso ideal = (72.7 * altura) - 58
// - para sexo feminino: peso ideal = (62.1 * altura) - 44.7

public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o seu nome :");
        String nome = sc.nextLine();

        System.out.println("Digite o seu sexo :");
        char sexo = sc.next().charAt(0);

        System.out.println("Digite sua altura :");
        double altura = sc.nextDouble();

        if (sexo == 'm') {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal de acordo com as características é " + pesoIdeal + "Kg");
        } else if (sexo == 'f') {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal de acordo com as características é " + pesoIdeal + "Kg");
        }
    }
}
