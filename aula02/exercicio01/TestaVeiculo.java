package exercicio01;

public class TestaVeiculo {
    public static void main(String[] args) {
        Veiculo novoVeiculo = new Veiculo("Punto", "Fiat", 7.5);

        novoVeiculo.mostraDadosCarro();
        novoVeiculo.retornaValorDoConsumo();

        novoVeiculo.setNovoConsumo(10.0);

        System.out.println("O novo consumo é " + novoVeiculo.getConsumo());

    }
}
