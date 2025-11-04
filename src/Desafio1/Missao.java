package Desafio1;

public class Missao {
    private String nome;
    private String nivelDificuldade;
    private boolean concluida;

    public Missao(String nome, String nivelDificuldade){
        this.nome = nome;
        this.nivelDificuldade = nivelDificuldade;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void completarMissao(){
        this.concluida = true;
        System.out.println("Missão \"" + nome + "\" foi completada!");
    }

    @Override
    public String toString(){
        String status = concluida ? "CONCLUÍDA" : "EM ANDAMENTO";
        return "Missão: " + nome + " | Dificuldade: " + nivelDificuldade + " | Status: " + status;
    }
}
