package criando.primeira.aplicacao;

public class Exercicio {
   public static void main (String[] args) {


       int a =10;
       int b = 5;
       int c = 30;
       int anoDeLacamento = 2022;

       //String nome = "Maria";
       int idade = 30;
       double valor = 55.9999;
       //System.out.println(String.format("Meu nome é %s, eu tenho %d anos e gastei %.2f reais ", nome, idade, valor));

       String nome = "João";
       int aulas = 4;
       String mensagem = """
                        Olá, %S!
                        Boas vindas ao cursos de Java.
                        Teremos %d aulas para te mostrar o que é preciso para você da o seu primeiro mergulho na linguagem!                  
               """.formatted(nome, aulas);
       System.out.println(mensagem);

       /* String testando;
        testando = """
        Esse texto é um teste
        Para System
        Out
        Print
        Ln
    """ + anoDeLacamento ;

        System.out.println(testando);
*/
    }

}
