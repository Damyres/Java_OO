package criando.primeira.aplicacao;

public class SwitchCase {

    public static void main(String[] args){

        int dia = 10;
        String nomeDia;

        switch(dia){
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda - feira";
                break;
            case 3:
                nomeDia = "Terça - feira";
                break;
            case 4:
                nomeDia = "Quarta - feira";
                break;
            case 5:
                nomeDia = "Quinta- feira";
                break;
            case 6:
                nomeDia = "Sexta - feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "inválido!";
            }
        System.out.println("O dia é " + dia + " e é " + nomeDia);
        }
    }