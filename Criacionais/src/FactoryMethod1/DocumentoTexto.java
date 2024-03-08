package FactoryMethod1;

class DocumentoTexto implements Documento {
	
    @Override
    
    public void criarConteudo() {
    
    	System.out.println("Conteúdo do documento de texto.");
    
    }
}
