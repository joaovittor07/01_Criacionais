package Prototype;

class Casa implements CasaPrototype {
    private String estilo;
    private int quartos;

    public Casa(String estilo, int quartos) {
        this.estilo = estilo;
        this.quartos = quartos;
    }

    @Override
    public Casa clonar() {
        return new Casa(estilo, quartos);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Estilo da Casa: " + estilo);
        System.out.println("Número de Quartos: " + quartos);
    }
}