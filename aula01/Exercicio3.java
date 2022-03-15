import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número desejado");
        int numero = sc.nextInt();
        System.out.println("=================================================");
        int contador = 1;
        while (contador <= numero) {
            System.out.println(contador);
            contador++;
        }
        sc.close();

    }
}
