package FactoryMethod2;

class FabricaImagem implements FabricaRecursoGrafico {
	
    @Override
    public RecursoGrafico criarRecurso() {
    
    	return new Imagem();
    
    }
}