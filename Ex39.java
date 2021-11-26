import java.util.Scanner;

//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

public class Ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o horário de início da partida");
        int inicio = sc.nextInt();

        System.out.println("Digite o horário de termino da partida");
        int termino = sc.nextInt();

        if (inicio >= termino) {
            int duracao = (24 - inicio) + termino;
            System.out.println("O jogo durou " + duracao + " horas");
        } else {
            int duracao = termino - inicio;
            System.out.println("O jogo durou " + duracao + " horas");
        }
    }
}
