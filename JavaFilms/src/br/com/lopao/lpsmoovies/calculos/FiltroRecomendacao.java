package br.com.lopao.lpsmoovies.calculos;


import br.com.lopao.lpsmoovies.modelos.Titulo;

public class FiltroRecomendacao {

    //Exemplo de Polimorfismo, pois de for um filme vai usar o metodo getClassificacao de filme,
    // se for um Episodio vai chamar o metodo de Episodio

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >=4){
            System.out.println(classificavel.getNome() + " é um dos preferidos da galera");
        } else if (classificavel.getClassificacao() >= 3) {
            System.out.println(classificavel.getNome() + " tem sido curtido");
        } else {
            System.out.println(classificavel.getNome() + " bom pra por na lista");
        }
    }
}
