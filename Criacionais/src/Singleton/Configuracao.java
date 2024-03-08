package Singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {

    private static Configuracao instancia = null;
    private Map<String, String> configuracoes;

    private Configuracao() {
        configuracoes = new HashMap<>();

    }

    public static synchronized Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String obterConfiguracao(String chave) {
        return configuracoes.get(chave);
    }

    public void definirConfiguracao(String chave, String valor) {
        configuracoes.put(chave, valor);
    }
    
}