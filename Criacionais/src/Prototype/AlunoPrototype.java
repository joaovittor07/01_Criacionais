/*Imagine que você está desenvolvendo um sistema de gerenciamento escolar e precisa criar objetos de 
 * alunos com informações básicas. O padrão Prototype pode ser usado para clonar objetos de aluno.*/

package Prototype;

interface AlunoPrototype {
	
    AlunoPrototype clonar();
    
    void exibirInformacoes();

}