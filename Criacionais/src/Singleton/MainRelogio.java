package Singleton;

import java.util.Date;

public class MainRelogio {

    public static void main(String[] args) {
        // Obtendo a instância única do Relogio
        Relogio relogio = Relogio.getInstancia();

        // Obtendo a hora atual
        Date horaAtual = relogio.getHoraAtual();

        // Exibindo a hora atual
        System.out.println("Hora atual: " + horaAtual);
    }
}
	
