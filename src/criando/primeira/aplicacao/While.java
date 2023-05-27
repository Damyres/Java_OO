package criando.primeira.aplicacao;

import java.util.Scanner;

public class While {
    public static void main (String[] argd){

        Scanner leitura = new Scanner(System.in);

        int nota = 0;
        double media = 0;
        int totalDeNotas =0;

        while (nota != -1){
            System.out.println("Qual a sua avaliação para o filme ou digite -1 para encerrar: ");
            nota = leitura.nextInt();
            if(nota != -1){
                media += nota;
                totalDeNotas ++;
            }
        }

        System.out.println("Média de avaliações é " + media /totalDeNotas);

    }

}
