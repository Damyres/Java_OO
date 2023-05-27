package criando.primeira.aplicacao;

import java.util.Scanner;

public class ExemploScanner {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " tem " + idade + " anos, " + "idará investir " + valor + " esse mês.");

    }
}
