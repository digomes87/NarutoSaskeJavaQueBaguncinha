package Intermediario.contrutores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoMorto;

    public Hokages(){

    };

    public Hokages(String nome){
        this.nome = nome;
    }

    public Hokages(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Hokages(String nome, int idade, boolean vivoMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoMorto = vivoMorto;
    }
}
