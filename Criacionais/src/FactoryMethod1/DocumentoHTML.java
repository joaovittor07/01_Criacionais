package FactoryMethod1;

class DocumentoHTML implements Documento {
	
    @Override
    
    public void criarConteudo() {
    
    	System.out.println("Conteúdo do documento HTML.");
    
    }
}