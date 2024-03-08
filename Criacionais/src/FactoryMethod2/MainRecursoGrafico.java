package FactoryMethod2;

public class MainRecursoGrafico {

    public static void main(String[] args) {
    	
        FabricaRecursoGrafico fabricaImagem = new FabricaImagem();
        RecursoGrafico imagem = fabricaImagem.criarRecurso();
        imagem.carregar();

        FabricaRecursoGrafico fabricaModelo3D = new FabricaModelo3D();
        RecursoGrafico modelo3D = fabricaModelo3D.criarRecurso();
        modelo3D.carregar();
    }
}
