package FluenteInterface;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Livro setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public Livro setPaginas(int paginas) {
        this.paginas = paginas;
        return this;
    }

    public void mostrarInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
}