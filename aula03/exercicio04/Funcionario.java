package exercicio04;

public class Funcionario {
    private String nome;
    private double horasTrabalhadas;
    private double valorPagoPorHorasTrabalhadas;


    public Funcionario(String nome, double horasTrabalhadas, double valorPagoPorHorasTrabalhadas) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPagoPorHorasTrabalhadas = valorPagoPorHorasTrabalhadas;
    }

    public Funcionario() {
    }

    public double calculaSalario(){
        return this.horasTrabalhadas * this.valorPagoPorHorasTrabalhadas;
    }

    public void exibeDadosFuncionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Horas trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Valor da hora para para o funcionário " + this.nome + " valor hora " + this.valorPagoPorHorasTrabalhadas + " reais.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPagoPorHorasTrabalhadas() {
        return valorPagoPorHorasTrabalhadas;
    }

    public void setValorPagoPorHorasTrabalhadas(double valorPagoPorHorasTrabalhadas) {
        this.valorPagoPorHorasTrabalhadas = valorPagoPorHorasTrabalhadas;
    }

}
