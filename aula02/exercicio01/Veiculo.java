package exercicio01;

public class Veiculo{
    private String modelo;
    private String marca;
    private double consumo;


    

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    public void mostraDadosCarro(){
        System.out.println("O modelo do carro é " + this.modelo + " e a marca é " + this.marca + ".");
    }

    public double retornaValorDoConsumo(){
        System.out.println("O consumo do carro é " + consumo + " KMs/Lts.");
        return consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setNovoConsumo(double novoConsumo) {
        this.consumo = novoConsumo;
    }

    
}