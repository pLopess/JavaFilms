package br.com.lopao.lpsmoovies.modelos;

//Criando a Classe Abstrata
public class Titulo {
    //Atributos
    private String nome;                    //modificador de acesso (private, public)
    private int anoLancamento;              //atributos devem ser privados
    private double somaDasAvaliacoes;
    private int totalAvaliacao;
    private int duracaoMinutos;
    private boolean incluidoPlano;

    //Metodos
    //Getters = Métodos de leitura dos atributos
    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }


    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    //Setters = Métodos de modificação dos atributos
    public void setNome(String nome) {
        this.nome = nome;            //“this” se refere ao objeto atual e não ao parâmetro do método
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }


    //outros metodos
    public void exibeFichaTecnica(){
        System.out.println( "O nome do titulo é: " + nome);
        System.out.println("Foi lançado em: " + anoLancamento);
        System.out.println("Tem uma duração de " + duracaoMinutos + " minutos");
        if (incluidoPlano){
            System.out.println("Incluído no plano" );
        }  else System.out.println("Este titulo não está incluido no seu plano atual");
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacao ++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacao;

    }
}
