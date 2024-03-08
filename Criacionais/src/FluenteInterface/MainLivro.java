package FluenteInterface;

public class MainLivro {
    public static void main(String[] args) {
    	
        Livro livro = new Livro()
                .setTitulo("O Senhor dos Anéis")
                .setAutor("J.R.R. Tolkien")
                .setPaginas(1200);

        livro.mostrarInformacoes();
    }
}