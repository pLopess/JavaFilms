import br.com.lopao.lpsmoovies.calculos.Calculadora;
import br.com.lopao.lpsmoovies.calculos.FiltroRecomendacao;
import br.com.lopao.lpsmoovies.modelos.Film; //importa a classe de outro package
import br.com.lopao.lpsmoovies.modelos.Serie;

public class Principal {
    public static void main(String[] args) { //Instanciando o Objeto
        Film filme1 = new Film();
        filme1.setNome("As Aventuras de Pi");
        filme1.setAnoLancamento(2012);
        filme1.setDuracaoMinutos(127);          //ctrl transforma tudo como se fosse um link com o clique
        filme1.setIncluidoPlano(true);
        System.out.println("Duaração do filme: " + filme1.getDuracaoMinutos());

        filme1.exibeFichaTecnica();
        filme1.avalia(9);
        filme1.avalia(6);
        filme1.avalia(8);

        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacao());
        System.out.println("Avalição média do filme: " + filme1.pegaMedia());

        Serie op = new Serie();
        op.setNome("One Piece");
        op.setAnoLancamento(1998);
        op.exibeFichaTecnica();
        op.setTemporadas(10);
        op.setEpisodiosPorTemporada(110);
        op.setMinutosPorEp(20);
        System.out.println("Duração para maratonar " + op.getNome() + ": " + op.getDuracaoMinutos() + " minutos!");

        Film filme2 = new Film();
        filme2.setNome("Avatar");
        filme2.setAnoLancamento(2023);
        filme2.setDuracaoMinutos(100);


        Calculadora calc = new Calculadora();
        calc.inclui(filme1);
        calc.inclui(filme2);
        calc.inclui(op);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNome("Piloto - One Piece");
        episodio.setNumero(01);
        episodio.setSerie(op);
        episodio.setTotalVisu(101);
        filtro.filtra(episodio);    //Se em FiltroRecomendacao:
                                    // public void filtra(Classificavel classificavel, Titulo titulo)
                                    // filtro.filtra(episodio, episodio);
    }
}
