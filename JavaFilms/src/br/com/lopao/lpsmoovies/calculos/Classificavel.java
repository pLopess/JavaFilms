package br.com.lopao.lpsmoovies.calculos;

//Interfaces permitem que diferentes classes possam ser tratadas de maneira padronizada,
// via polimorfismo, tornando assim o código fácil de estender com novos comportamentos
//A classe que implementa a interface deve implementar todos os métodos definidos na interface
public interface Classificavel {   //Nao pode criar um objeto de uma interface
                                   // apenas uma referencia
    int getClassificacao();
    String getNome();
}
