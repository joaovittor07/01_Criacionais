package FactoryMethod1;

class FabricaDocumentoHTML implements FabricaDocumento {
	
    @Override
    
    public Documento criarDocumento() {
    
    	return new DocumentoHTML();
    	
    }
}