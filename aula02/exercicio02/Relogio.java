package exercicio02;

public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }


    public void exibiHoras(){
        System.out.println("A hora atual é " + this.hora + ":" + this.minuto + ":" + this.segundo);
    }


    public int getHora() {
        return hora;
    }


    public void setHora(int hora) {
        if(hora >= 0 && hora <= 23){
            this.hora = hora;
        }else{
            System.out.println("A hora não pode ser menor que zero e maior que 23.");
        }
        
    }


    public int getMinuto() {
        return minuto;
    }


    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto <= 59){
             this.minuto = minuto;
        }else{
            System.out.println("Minutos não pode ser menor que zero e maior que 59");
        }
    }


    public int getSegundo() {
        return segundo;
    }


    public void setSegundo(int segundo) {
        if(segundo >= 0 && segundo <= 59){
            this.segundo = segundo;
        }else{
            System.out.println("Segundos não pode ser menor que zero e maior que 59");
        }
    }


    
    
    
}
