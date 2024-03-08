package FactoryMethod1;

public class MainDocumento {

	public static void main(String[] args) {
        
        FabricaDocumento fabricaTexto = new FabricaDocumentoTexto();
        Documento documentoTexto = fabricaTexto.criarDocumento();
        documentoTexto.criarConteudo();

        FabricaDocumento fabricaHTML = new FabricaDocumentoHTML();
        Documento documentoHTML = fabricaHTML.criarDocumento();
        documentoHTML.criarConteudo();
    }
	
}
