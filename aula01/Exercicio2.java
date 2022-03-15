import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário bruto");
        double salario = sc.nextDouble();
        System.out.println("Digite o valor da prestação desejada");
        double prestacao = sc.nextDouble();

        double limite = salario * 0.3;

        if(prestacao <= limite){
            System.out.println("Seu emprestimo pode ser efetivado com essa valor de prestação");
        }else{
            System.out.println("Seu emprestimo não pode ser efetivado com esse valor de prestação");
        }



        sc.close();

    }

}
