import java.util.Scanner;

public class Exercicio4ComWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, limite;
        System.out.println("Digite o número da tabuada que deseja implementar!");
        numero = sc.nextInt();
        limite = 0;
        while(limite <= 10){
            System.out.println(numero + " X " + limite + " = " + numero * limite);
            limite++;
        }


        sc.close();
    }
}
