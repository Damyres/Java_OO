package aplicando.orientacao.objeto.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPortemporadas;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getTemporadas(){
        return temporadas;
    }

    public void setTemporadas (int temporadas){
        this.temporadas = temporadas;
    }

    public int getEpisodiosPortemporadas(){
        return episodiosPortemporadas;
    }
    public void setEpisodiosPortemporadas(int episodiosPortemporadas){
        this.episodiosPortemporadas = episodiosPortemporadas;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }
    public int getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinuto() {
        return temporadas * episodiosPortemporadas * minutosPorEpisodio;
    }

    public void imprimiFichaTecnica() {
        System.out.println("Filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Tempo: " + getMinutosPorEpisodio() + " minutos. ");
    }
}
