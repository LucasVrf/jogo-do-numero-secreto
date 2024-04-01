package br.com.alura.screenmatch.modelos;

public class Titulo {
        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliacoes;
        private int totalAvaliacao;
        private int duracaoEmMinutos;

        public int getTotalAvaliacao() {
            return totalAvaliacao;
        }

        public String getNome() {
            return nome;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }

        public boolean isIncluidoNoPlano() {
            return incluidoNoPlano;
        }

        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void exibeFichaTecnica() {
            System.out.println("Nome do Filme: " + nome);
            System.out.println("Ano de lancamento: " + anoDeLancamento);
        }

        public void avalia(double nota) {
            somaDasAvaliacoes += nota;
            totalAvaliacao++;
        }

        public double retornaMedia() {
            return somaDasAvaliacoes / totalAvaliacao;
        }
}
