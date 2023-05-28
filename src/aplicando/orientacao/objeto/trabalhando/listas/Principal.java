package aplicando.orientacao.objeto.trabalhando.listas;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.nome = "Cavaleiro sem cabeça";
        filme1.anDeLancamento = 2009;
        filme1.duracaoEmMinuto = 95;
        filme1.incluindoNoPlano = true;
        filme1.somaDasAvaliacoes = 7.9;
        filme1.totalDeAvaliacao = 3;

        filme1.imprimiFichaTecnica();

        filme1.avaliaFilme (10);
        filme1.avaliaFilme(7);
        filme1.avaliaFilme(7);

        filme1.mediaDasAvaliacoes();

        System.out.println("Soma de avaliações: " + filme1.somaDasAvaliacoes);
        System.out.println("Número total de avaliações recebidas: " + filme1.totalDeAvaliacao);
        System.out.println("Média das avaliações: " +filme1.mediaDasAvaliacoes());
    }
}
