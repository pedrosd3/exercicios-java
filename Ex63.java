import java.util.Scanner;

//Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
//estar em condições, um dos seguintes requisitos deve ser satisfeito:
// - Ter no mínimo 65 anos de idade.
// - Ter trabalhado no mínimo 30 anos.
// - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.

public class Ex63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        System.out.println("Digite seu tempo de contribuição");
        int tempo = sc.nextInt();

        if (idade >= 65 || tempo >= 30 || (idade >= 60 && tempo >= 25)) {
            System.out.println("O funcionário está apto para aposentadoria");
        } else {
            System.out.println("O funcionário não está apto para aposentadoria");
        }
    }
}
