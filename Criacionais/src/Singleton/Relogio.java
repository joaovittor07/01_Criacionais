package Singleton;

import java.util.Date;

public class Relogio {

    private static Relogio instancia = null;

    private Relogio() {

    }

    public static synchronized Relogio getInstancia() {
        if (instancia == null) {
            instancia = new Relogio();
        }
        return instancia;
    }

    public Date getHoraAtual() {
        return new Date();
    }

}