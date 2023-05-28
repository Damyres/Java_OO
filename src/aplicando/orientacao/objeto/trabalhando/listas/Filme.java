package aplicando.orientacao.objeto.trabalhando.listas;

public class Filme {
    String nome;
    int anDeLancamento;
    boolean incluindoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinuto;

    void imprimiFichaTecnica(){
        System.out.println("Filme: " + nome);
        System.out.println("Ano de lançamento: " + anDeLancamento);
        System.out.println("Tempo: "  + duracaoEmMinuto + " minutos. ");
    }

    void avaliaFilme(double nota){
        somaDasAvaliacoes +=nota;
        totalDeAvaliacao++;
    }
    double mediaDasAvaliacoes (){
        return somaDasAvaliacoes/totalDeAvaliacao;
    }

}
