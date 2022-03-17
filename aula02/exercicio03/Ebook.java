package exercicio03;

public class Ebook {
    private String titulo;
    private String autor;
    private Integer totalPaginas;
    private Integer numeroPaginaAtual;



    public Ebook(String titulo, String autor, Integer totalPaginas, Integer numeroPaginaAtual) {
        this.titulo = titulo;
        this.autor = autor;
        setTotalPaginas(totalPaginas);
        setNumeroPaginaAtual(numeroPaginaAtual);
    }

    public void avancarPagina(){
        this.numeroPaginaAtual = numeroPaginaAtual + 1;
        System.out.println("A página atual agora é " + this.numeroPaginaAtual);
    }

    public void voltarPagina(){
        this.numeroPaginaAtual = numeroPaginaAtual - 1;
        System.out.println("A página atual agora é " + this.numeroPaginaAtual);
    }

    public void mostrarNumeroPaginaAtual(){
        System.out.println("A página atual é " + this.numeroPaginaAtual);
    }

    public void mostrarDadosDoLibro(){
        System.out.println("Os dados do livro que você está lendo é " + "(");
        System.out.println("Nome do livro: " + this.titulo);
        System.out.println("Nome do autor: " + this.autor);
        System.out.println("Total de páginas: " + this.totalPaginas + " )");
    }

    public Integer irParaPaginaInformada(Integer pagina){
        this.numeroPaginaAtual = pagina;
        System.out.println("Você selecionou a página " + this.numeroPaginaAtual);
        return numeroPaginaAtual;
    }


    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    public Integer getTotalPaginas() {
        return totalPaginas;
    }



    public void setTotalPaginas(Integer totalPaginas) {
        if(totalPaginas != null && totalPaginas > 0) {
            this.totalPaginas = totalPaginas;
        }else{
            System.out.println("Total de pagina não pode ser nulo e ou menor que zero");
        }
        
    }



    public Integer getNumeroPaginaAtual() {
        return numeroPaginaAtual;
    }



    public void setNumeroPaginaAtual(Integer numeroPaginaAtual) {
        if (numeroPaginaAtual != null && numeroPaginaAtual > 0) {
            this.numeroPaginaAtual = numeroPaginaAtual;
        }else{
            System.out.println("Total de paginas não pode ser nulo e ou menor que zero");
        }
        
    }

    
    

}
