package FactoryMethod1;

class FabricaDocumentoTexto implements FabricaDocumento {
	
    @Override
    
    public Documento criarDocumento() {
    
    	return new DocumentoTexto();
    
    }
}