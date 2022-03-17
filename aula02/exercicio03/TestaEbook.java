package exercicio03;

public class TestaEbook {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("As tranças da Vovó careca", "Vovó Careca", 1353, 1);
        ebook.mostrarNumeroPaginaAtual();
        ebook.avancarPagina();
        ebook.voltarPagina();
        ebook.mostrarDadosDoLibro();
        ebook.irParaPaginaInformada(300);
        ebook.mostrarNumeroPaginaAtual();
    }
}
