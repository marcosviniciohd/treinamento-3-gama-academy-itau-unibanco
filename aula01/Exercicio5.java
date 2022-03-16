import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para começar!");
        numero = sc.nextInt();
        while(numero != 0) {
            System.out.println("Digite outro numero para continuar ");
            int outroNumero = sc.nextInt();
            numero += outroNumero;
            if(outroNumero == 0){
                break;
            }
        }
        System.out.println("A soma dos números digitados é " + numero);
        sc.close();
    }
}
