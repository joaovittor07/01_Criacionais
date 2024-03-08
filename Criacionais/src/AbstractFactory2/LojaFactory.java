package AbstractFactory2;

interface LojaFactory {
	
    Produto criarProduto();
    Pagamento criarPagamento();

}