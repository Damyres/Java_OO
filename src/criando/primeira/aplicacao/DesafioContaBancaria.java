package criando.primeira.aplicacao;

import java.util.Scanner;

/*O que devo fazer:
Inicializar dados do cliente
Menu de opções
Visualização do saldo
Enviar valor
Receber valor*/

public class DesafioContaBancaria {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("*******************");
        System.out.println("Dados iniciais do cliente: ");

        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Tipo de conta: ");
        String tipoDeConta = leitor.nextLine();

        double saldo = 5000.00;

        System.out.println("**********************");
        int opcao = 0;
        String menu = """
                Digite a operação desejada:
                1 - Consultar saldos
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir?");
                double valor = leitor.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não saldo suficiente para realizar a transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido");
                double valor = leitor.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual " + saldo);
            } else if (opcao != 4) {
                System.out.println("opção inválida");
            } else {
                System.out.println("A opção sair foi selecionada, sua transação foi encerrada. Obrigado!");

            }
        }

    }

}
