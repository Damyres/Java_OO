package aplicando.orientacao.objeto.modelos;

import javax.swing.text.DefaultEditorKit;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinuto;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setAnDeLancamento(int anDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean IncluindoNoPlano(){
        return incluindoNoPlano;
    }

    public void setIncluindoNoPlano(boolean incluindoNoPlano){
        this.incluindoNoPlano = incluindoNoPlano;
    }

    public int getDuracaoEmMinuto(){
        return duracaoEmMinuto;
    }
    public void setDuracaoEmMinuto(int duracaoEmMinuto){
        this.duracaoEmMinuto = duracaoEmMinuto;
    }

    public void imprimiFichaTecnica() {
        System.out.println("Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Tempo: " + duracaoEmMinuto + " minutos. ");
    }


    public void avaliaFilme(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double mediaDasAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

}
