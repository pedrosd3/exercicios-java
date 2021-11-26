import java.util.Scanner;

//Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com
//saída uma das seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a
//mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente também junto da
//mensagem de saudação o nome previamente informado.

public class Ex76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        System.out.println("Digite '1' para sexo masculino e '2' para sexo feminino");
        int sexo = sc.nextInt();

        if (sexo == 1) {
            System.out.println("Olá Sr." + nome);
        } else if (sexo == 2) {
            System.out.println("Olá Sra." + nome);
        } else {
            System.out.println("Um dos valores inseridos não foi correspondido");
        }
    }
}
