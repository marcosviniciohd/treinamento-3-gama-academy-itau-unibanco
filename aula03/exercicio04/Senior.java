package exercicio04;

public class Senior extends Funcionario{
    private double bonus;

    

    public Senior(String nome, double horasTrabalhadas, double valorPagoPorHorasTrabalhadas, double bonus) {
        super(nome, horasTrabalhadas, valorPagoPorHorasTrabalhadas);
        this.bonus = bonus;
    }

    public Senior(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public double calculaSalario() {
        
        return super.calculaSalario() + (getHorasTrabalhadas() / 10) * bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    

}
