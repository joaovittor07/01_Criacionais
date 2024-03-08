package Builder;

class Filme {
    private String titulo;
    private String diretor;
    private String genero;
    private String classificacao;

    private Filme(String titulo, String diretor, String genero, String classificacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getGenero() {
        return genero;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public static class Builder {
        private String titulo;
        private String diretor;
        private String genero;
        private String classificacao;

        public Builder(String titulo) {
            this.titulo = titulo;
        }

        public Builder setDiretor(String diretor) {
            this.diretor = diretor;
            return this;
        }

        public Builder setGenero(String genero) {
            this.genero = genero;
            return this;
        }

        public Builder setClassificacao(String classificacao) {
            this.classificacao = classificacao;
            return this;
        }

        public Filme build() {
            return new Filme(titulo, diretor, genero, classificacao);
        }
    }
}
