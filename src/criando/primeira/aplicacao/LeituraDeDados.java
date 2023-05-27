package criando.primeira.aplicacao;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual seu filme favorito? ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento do filme? ");
        int anoLacamento = leitura.nextInt();

        System.out.println("Qual nota para você atribui para este filme? ");
        double nota = leitura.nextDouble();

        System.out.println("Seu filme favorito é " + filme +  ", " + "ano de lançamento é " + anoLacamento + " a nota do seu filme favorito é " + nota);
    }
}
