package Manipulando.objetos;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public void fazAniversario(){
        idade++;
    }

    public void exibePessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
