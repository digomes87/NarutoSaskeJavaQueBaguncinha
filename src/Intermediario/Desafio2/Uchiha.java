package Intermediario.Desafio2;

public class Uchiha  extends Ninja{
    private String habilidadesEspecial;
    public Uchiha(String nome, int idade, String missao,
                  String nivelDificuldade, String statusMissao, String habilidadesEspecial){
        super(nome, idade, missao, nivelDificuldade, statusMissao);
        this.habilidadesEspecial = habilidadesEspecial;
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: "+habilidadesEspecial);
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: "+ habilidadesEspecial);
    }

    public String getHabilidadesEspecial() {
        return habilidadesEspecial;
    }

    public void setHabilidadesEspecial(String habilidadesEspecial) {
        this.habilidadesEspecial = habilidadesEspecial;
    }

}
