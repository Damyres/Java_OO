package aplicando.orientacao.objeto.modelos;

public class Titulo {
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

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluindoNoPlano(){
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
    public void imprimiFichaTecnica() {
        System.out.println("Filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Tempo: " + getDuracaoEmMinuto() + " minutos. ");
    }

}
