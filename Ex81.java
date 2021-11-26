import java.util.Scanner;

//Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
//considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
//neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).

public class Ex81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int valor = 3;
        int fixo = 1;
        int cont = 1;

        while (cont <= 15) {
            int result = valor * fixo;
            fixo = 3;
            int aux = result;
            valor = aux;
            cont = cont + 1;
            System.out.println(result);
        }
    }
}
