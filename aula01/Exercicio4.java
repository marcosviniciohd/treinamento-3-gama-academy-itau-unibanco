import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que deseja implementar a tabuada");
        int numero = sc.nextInt();
        int limite = 10;
        for (int i = 0; i <= limite; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }

        
        sc.close();
    }
}
