package aplicando.orientacao.objeto.trabalhando.listas;

import aplicando.orientacao.objeto.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();

        filme1.setNome("Cavaleiro sem cabeça");
        filme1.setAnDeLancamento(2009);
        filme1.setDuracaoEmMinuto(95);

        filme1.imprimiFichaTecnica();

        filme1.avaliaFilme (10);
        filme1.avaliaFilme(7);
        filme1.avaliaFilme(7);


        //System.out.println("Soma de avaliações: " + filme1.somaDasAvaliacoes);
        //System.out.println("Número total de avaliações recebidas: " + filme1.totalDeAvaliacao);
        System.out.println("Total de avaliações: "+ filme1.getTotalDeAvaliacao());
        System.out.println("Média das avaliações: " + filme1.mediaDasAvaliacoes());

    }
}
