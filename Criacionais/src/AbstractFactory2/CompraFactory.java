package AbstractFactory2;

class CompraFactory implements LojaFactory {
	
    @Override
    public Produto criarProduto() {
    
    	return new Roupa();
    
    }

    @Override
    public Pagamento criarPagamento() {
    
    	return new Cartao();
    
    }
}