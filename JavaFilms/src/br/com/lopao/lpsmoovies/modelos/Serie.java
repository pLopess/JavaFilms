package br.com.lopao.lpsmoovies.modelos;

import br.com.lopao.lpsmoovies.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEp;
    private boolean ativa;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEp(){
        return minutosPorEp;
    }

    public void setMinutosPorEp(int minutosPorEp){
        this.minutosPorEp = minutosPorEp;
    }

    @Override  //Sobrescrita = reescrevendo o metódo (mudando como ele vai funcionar mas mantendo o nome)
    public int getDuracaoMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEp;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
