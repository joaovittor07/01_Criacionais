package Prototype;

class Aluno implements AlunoPrototype {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public Aluno clonar() {
        return new Aluno(nome, idade);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade);
    }
}
