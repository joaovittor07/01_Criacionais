package AbstractFactory2;

class Cartao implements Pagamento {
	
    @Override
    public String getDescricao() {
    
    	return "Pagamento com Cartão de Crédito";
    
    }
}