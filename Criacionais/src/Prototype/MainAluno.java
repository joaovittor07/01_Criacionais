package Prototype;

public class MainAluno {
    public static void main(String[] args) {
 
        Aluno alunoOriginal = new Aluno("João", 15);

        Aluno alunoClonado = alunoOriginal.clonar();

        System.out.println("Informações do Aluno Original:");
        alunoOriginal.exibirInformacoes();
 
        System.out.println("\nInformações do Aluno Clonado:");
        alunoClonado.exibirInformacoes();
    }
}