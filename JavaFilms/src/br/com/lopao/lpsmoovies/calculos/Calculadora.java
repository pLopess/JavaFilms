package br.com.lopao.lpsmoovies.calculos;

import br.com.lopao.lpsmoovies.modelos.Film;
import br.com.lopao.lpsmoovies.modelos.Serie;
import br.com.lopao.lpsmoovies.modelos.Titulo;

public class Calculadora {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }


    //Sobrecarga = mesmo metódo, mudando somente o paramêtro
//    public void inclui(Film f) {
//        tempoTotal += f.getDuracaoMinutos();
//    }
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoMinutos();
//    }


    //Polimorfismo = pode ter mais de uma forma (Titulo pode ser Série ou Filme)
    public void inclui(Titulo t){
        tempoTotal += t.getDuracaoMinutos();
    }
}
