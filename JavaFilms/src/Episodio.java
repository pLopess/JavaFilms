import br.com.lopao.lpsmoovies.calculos.Classificavel;
import br.com.lopao.lpsmoovies.modelos.Serie;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisu;

    public int getNumero() {
        return numero;
    }

    public int getTotalVisu() {
        return totalVisu;
    }

    public void setTotalVisu(int totalVisu) {
        this.totalVisu = totalVisu;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisu >= 100) {
            return 4;
        } else {
            return 2;
        }
    }
}