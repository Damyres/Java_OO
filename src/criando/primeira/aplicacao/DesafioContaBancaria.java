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

        String operacoes = """
                Operações:
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;
        System.out.println(operacoes);

        /*System.out.println("Operações: ");
        System.out.println("1 - Consultar saldos");

        System.out.println("2 - Receber valor");

        System.out.println("3 - Transferir valor");

        System.out.println("4 - Sair");*/ //otimizando linhas de código

        System.out.println("Digite a operação desejada:");
        int numeroDigitado = leitor.nextInt();

        if(numeroDigitado == 1){
            System.out.println("Consultar saldos");
        } else if(numeroDigitado ==2){
            System.out.println("Receber valor");
        } else if(numeroDigitado == 3){
            System.out.println("Tranferir valor");
        } else if (numeroDigitado ==4){
            System.out.println("Sair");
        } else {
            System.out.println("Número inválido!");
        }

              /* if(numeroDigitado == 1){
            System.out.println("Consultar saldos");
        } else if(numeroDigitado ==2){
            System.out.println("Receber valor");
        } else if(numeroDigitado == 3){
            System.out.println("Tranferir valor");
        } else if (numeroDigitado ==4){
            System.out.println("Sair");
        } else {
            System.out.println("Número inválido!");
        }*/




    }

}
