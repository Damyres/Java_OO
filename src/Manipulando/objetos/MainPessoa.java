package Manipulando.objetos;

public class MainPessoa {

    public static void main (String[] args){

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Maria das Neves da Silva";
        pessoa1.idade = 34;

        pessoa1.exibePessoa();

        pessoa1.fazAniversario();


        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "José Gabriel Silva";
        pessoa2.idade = 45;

        pessoa2.exibePessoa();

        pessoa2.fazAniversario();

    }

}
