package aplicando.orientacao.objeto.trabalhando.listas;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.nome = "Cavaleiro sem cabeça";
        filme1.anDeLancamento = 2009;
        filme1.duracaoEmMinuto = 95;
        filme1.incluindoNoPlano = true;
        filme1.avaliacao = 7.9;
        filme1.totalDeAvaliacao = 100;


        System.out.println("Filme: " + filme1.nome);
        System.out.println("Ano de lançamento: " + filme1.anDeLancamento);
        System.out.println("Tempo: " + filme1.duracaoEmMinuto + " minutos. ");

    }
}
