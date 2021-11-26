import java.util.Scanner;

//Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar
//se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução
//se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.

public class Ex80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int numero = 1;

        while (numero <= 20) {
            System.out.println(numero);
            numero += 2;
        }
    }
}
