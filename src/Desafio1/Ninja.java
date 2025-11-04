package Desafio1;

public class Ninja {
    private String nome;
    private int idade;
    private Missao missaoAtual;

    public Ninja(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.missaoAtual = null;
    }

    public Ninja(String nome, int idade, Missao missao){
        this.nome = nome;
        this.idade = idade;
        this.missaoAtual = missao;
    }

    public String getNome() {
        return nome;
    }

    // Set the ninja's name
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Missao getMissaoAtual() {
        return missaoAtual;
    }

    // Assign a new mission to the ninja
    public void setMissaoAtual(Missao missao) {
        this.missaoAtual = missao;
        System.out.println(this.getNome() + " recebeu uma nova missão: " + missao.getNome());
    }

    public void completarMissaoAtual(){
        if (missaoAtual != null && !missaoAtual.isConcluida()){
            missaoAtual.completarMissao();
        }else if (missaoAtual == null){
            System.out.println(this.getNome() +" Nao tem missao atribuida");
        }else{
            System.out.println("Missao de "+ this.getNome()+ " Já esta concluída");
        }
    }

    // Display ninja info; matches calls from VilaDaFolha
    public void exibirInfo(){
        System.out.println("=== " + this.getNome().toUpperCase() + " ===");
        System.out.println("Idade: " + this.getIdade() + " anos");
        if (this.getMissaoAtual() != null) {
            System.out.println(this.getMissaoAtual());
        } else {
            System.out.println("Nenhuma missão atribuída");
        }
        System.out.println();
    }

}
