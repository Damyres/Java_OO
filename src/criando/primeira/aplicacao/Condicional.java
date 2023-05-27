package criando.primeira.aplicacao;

public class Condicional {

    public static void main(String[] args) {

    int anoLacamento = 1990;
    boolean inclusoNoPlano = false;
    double notaDoFilme = 8.1;
    String tipoPlano = "normal";

    if (anoLacamento >= 2022){
        System.out.println("Lancamento que os clientes estão curtindo!");
    } else {
        System.out.println("Filme retrô" );
    }
    if(inclusoNoPlano == true || tipoPlano.equals("plus")){
        System.out.println("Filme liberado");
    } else{
        System.out.println("Deve pagar a locação");
    }
    }
}
