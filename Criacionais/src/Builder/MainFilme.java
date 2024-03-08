package Builder;

public class MainFilme {
    public static void main(String[] args) {
    	
        Filme filme = new Filme.Builder("Interestelar")
                .setDiretor("Christopher Nolan")
                .setGenero("Ficção Científica")
                .setClassificacao("PG-13")
                .build();

        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Diretor: " + filme.getDiretor());
        System.out.println("Gênero: " + filme.getGenero());
        System.out.println("Classificação: " + filme.getClassificacao());
    }
}