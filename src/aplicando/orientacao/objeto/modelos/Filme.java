package aplicando.orientacao.objeto.modelos;

public class Filme {
    public String nome;
    int anDeLancamento;
    boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    int duracaoEmMinuto;

    public void imprimiFichaTecnica(){
        System.out.println("Filme: " + nome);
        System.out.println("Ano de lançamento: " + anDeLancamento);
        System.out.println("Tempo: "  + duracaoEmMinuto + " minutos. ");
    }

    public void avaliaFilme(double nota){
        somaDasAvaliacoes +=nota;
        totalDeAvaliacao++;
    }
    public double mediaDasAvaliacoes (){
        return somaDasAvaliacoes/totalDeAvaliacao;
    }

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

}
