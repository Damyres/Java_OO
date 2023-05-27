package criando.primeira.aplicacao;

import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main (String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("*******************");
        System.out.println("Dados iniciais do cliente: ");

        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Tipo de conta: ");
        String tipoDeConta = leitor.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = leitor.nextDouble();

        System.out.println("**********************");


    }

}
