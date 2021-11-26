import java.util.Scanner;

//Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um
//automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto
//(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a
//distância percorrida com a fórmula DISTANCIA ← TEMPO * VELOCIDADE. Possuindo o valor da
//distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
//LITROS_USADOS ← DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade
//média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a
//quantidade de litros (LITROS_USADOS) utilizada na viagem.

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o tempo total da viagem :");
        int tempoTotal = sc.nextInt();

        System.out.println("Digite a velocidade média durante a viagem :");
        int velocidadeMedia = sc.nextInt();

        float distancia = tempoTotal * velocidadeMedia;
        float combustivelUsado = distancia / 12;
        System.out.println("O total de combustível gasto na viagem foi " + combustivelUsado + " litros.");

        sc.close();
    }
}
