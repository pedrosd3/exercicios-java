import java.util.Scanner;

//Elaborar um programa que apresente como resultado o valor de uma potência de uma base
//qualquer elevada a um expoente qualquer, ou seja, de BE
//, em que B é o valor da base e E o valor
//do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
//portuguol (^).

public class Ex82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a base do cálculo");
        int base = sc.nextInt();

        System.out.println("Digite o expoente do cálculo");
        int expoente = sc.nextInt();

        int baseAux = base;
        int aux = 1;

        while (aux < expoente) {
            int result = base * baseAux;
            base = result;
            aux = aux + 1;
            System.out.println(result);
        }
    }
}
