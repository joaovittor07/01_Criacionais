package Builder;

public class MainCarro {
    public static void main(String[] args) {
        
        Carro carro = new Carro.Builder("Sedan")
                .setCor("Preto")
                .setPotencia(150)
                .build();

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Potência: " + carro.getPotencia() + " HP");
    }
}