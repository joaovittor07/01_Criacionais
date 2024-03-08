package Builder;

class Carro {
    private String modelo;
    private String cor;
    private int potencia;

    private Carro(String modelo, String cor, int potencia) {
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public static class Builder {
        private String modelo;
        private String cor;
        private int potencia;

        public Builder(String modelo) {
            this.modelo = modelo;
        }

        public Builder setCor(String cor) {
            this.cor = cor;
            return this;
        }

        public Builder setPotencia(int potencia) {
            this.potencia = potencia;
            return this;
        }

        public Carro build() {
            return new Carro(modelo, cor, potencia);
        }
    }
}