package FactoryMethod2;

class FabricaModelo3D implements FabricaRecursoGrafico {
	
    @Override
    public RecursoGrafico criarRecurso() {
    
    	return new Modelo3D();
    
    }
}
