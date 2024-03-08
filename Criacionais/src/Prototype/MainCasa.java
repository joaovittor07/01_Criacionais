package Prototype;

public class MainCasa {
    public static void main(String[] args) {

        Casa casaOriginal = new Casa("Contemporânea", 3);

        Casa casaClonada = casaOriginal.clonar();


        System.out.println("Detalhes da Casa Original:");
        casaOriginal.exibirDetalhes();

        System.out.println("\nDetalhes da Casa Clonada:");
        casaClonada.exibirDetalhes();
    }
}