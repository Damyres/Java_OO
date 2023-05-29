package Manipulando.objetos;

public class Main {

    public static void main (String[] args){

        Venda venda1 = new Venda();
        venda1.produto = "Caneta";
        venda1.quantidade =1000;
        venda1.valorUnitario = 2.00;

        System.out.println("Produto: " + venda1.produto);
        System.out.println("Quantidade: " + venda1.quantidade);
        System.out.println("Valor unitário: " +venda1.valorUnitario);
        System.out.println("Valor total: " + venda1.quantidade * venda1.valorTotal);

    }

}
