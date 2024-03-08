package AbstractFactory1;

class PacoteViagemFactory implements AgenciaViagensFactory {
	
    @Override
    public Passagem criarPassagem() {
    
    	return new PassagemAviao();
    
    }

    @Override
    public Hospedagem criarHospedagem() {
    
    	return new Hotel();
    
    }
}