import java.util.Scanner;

public class Exercicio5Reforco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para comerçamos!");
        int numero = sc.nextInt();
        int soma = 0;
        while (numero != 0){
            soma = soma + numero;
            numero = sc.nextInt();
        }
        System.out.println("A soma dos números digitados é " + soma);
        sc.close();
    }
}
