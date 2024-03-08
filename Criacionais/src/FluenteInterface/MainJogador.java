package FluenteInterface;

public class MainJogador {
    public static void main(String[] args) {
        
        Jogador jogador = new Jogador()
                .setNome("Gamer123")
                .setPontuacao(500)
                .setNivel(10);

        jogador.mostrarInformacoes();
    }
}