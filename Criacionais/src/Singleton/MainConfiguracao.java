package Singleton;

public class MainConfiguracao {
	
    public static void main(String[] args) {
        Configuracao configuracao = Configuracao.getInstancia();

        System.out.println(configuracao.obterConfiguracao("idioma"));

        configuracao.definirConfiguracao("idioma", "portugues");

        System.out.println(configuracao.obterConfiguracao("idioma"));
    }
}