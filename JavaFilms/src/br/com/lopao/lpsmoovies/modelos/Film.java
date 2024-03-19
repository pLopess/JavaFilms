package br.com.lopao.lpsmoovies.modelos;


import br.com.lopao.lpsmoovies.calculos.Classificavel;

public class Film extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
