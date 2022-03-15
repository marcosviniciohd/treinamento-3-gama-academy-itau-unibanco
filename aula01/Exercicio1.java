import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média das notas do aluno é " + media);
        
        sc.close();
    }
}