import java.util.Scanner;

//Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). Durante a
//apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para
//cada candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de
//votos válidos para cada candidato, além de efetuar também a leitura da quantidade de votos nulos e
//votos em branco. Ao final o programa deve apresentar o número total de eleitores, considerando votos
//válidos, nulos e em branco; o percentual correspondente de votos válidos em relação à quantidade de
//eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade de
//eleitores; o percentual correspondente de votos válidos do candidato B em relação à quantidade de
//eleitores; o percentual correspondente de votos válidos do candidato C em relação à quantidade de
//eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; e por último
//o percentual correspondente de votos em branco em relação à quantidade de eleitores.

public class Ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantos votos teve o candidato A");
        int votosA = sc.nextInt();

        System.out.println("Quantos votos teve o candidato B");
        int votosB = sc.nextInt();

        System.out.println("Quantos votos teve o candidato C");
        int votosC = sc.nextInt();

        System.out.println("Quantos votos nulos houveram na eleição");
        int votosNulos = sc.nextInt();

        System.out.println("Quantos votos brancos houveram na eleição");
        int votosBrancos = sc.nextInt();

        double total = votosA + votosB + votosC + votosNulos + votosBrancos;

        double percentualA = votosA / total * 100;
        double percentualB = votosB / total * 100;
        double percentualC = votosC / total * 100;
        double percentualNulos = votosNulos / total * 100;
        double percentualBrancos = votosBrancos / total * 100;

        System.out.println("A eleição teve " + total + " votos no total");
        System.out.println("A eleição teve " + percentualA + " % dos votos no candidato A");
        System.out.println("A eleição teve " + percentualB + " % dos votos no candidato B");
        System.out.println("A eleição teve " + percentualC + " % dos votos no candidato C");
        System.out.println("A eleição teve " + percentualNulos + " % dos votos nulos");
        System.out.println("A eleição teve " + percentualBrancos + " % dos votos brancos");

    }
}
