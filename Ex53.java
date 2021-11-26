import java.util.Scanner;

//Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

public class Ex53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o nome do time da casa :");
        String timeCasa = sc.next();

        System.out.println("Digite o nome do time visitante :");
        String timeVisitante = sc.next();

        System.out.println("Digite quantos gols fez o " + timeCasa);
        int golsCasa = sc.nextInt();

        System.out.println("Digite quantos gols fez o " + timeVisitante);
        int golsVisitante = sc.nextInt();

        if (golsCasa > golsVisitante) {
            System.out.println(timeCasa + " venceu por " + golsCasa + "x" + golsVisitante);
        } else if (golsVisitante > golsCasa) {
            System.out.println(timeVisitante + " venceu por " + golsVisitante + "x" + golsCasa);
        } else {
            System.out.println("O jogo terminou empatado");
        }
    }
}
