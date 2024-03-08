package FluenteInterface;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Jogador setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
        return this;
    }

    public Jogador setNivel(int nivel) {
        this.nivel = nivel;
        return this;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
    
}