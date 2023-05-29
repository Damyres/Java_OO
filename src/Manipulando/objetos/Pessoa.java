package Manipulando.objetos;

public class Pessoa {
    String nome;
    int idade;

    void fazAniversario(){        idade++;
    }

    void exibePessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
