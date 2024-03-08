package AbstractFactory1;

interface AgenciaViagensFactory {
	
    Passagem criarPassagem();
    Hospedagem criarHospedagem();
    
}