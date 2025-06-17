package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinuto;
    private boolean incluidoNoPlano;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinuto() {
        return duracaoEmMinuto;
    }

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;

    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinuto(int duracacaoEmMinuto) {
        this.duracaoEmMinuto = duracacaoEmMinuto;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do br.com.alura.screenmatch.modelos.Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia (){
        return somaDasAvaliacoes / totalDeAvaliacao;

    }
}
