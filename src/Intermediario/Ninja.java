package Intermediario;

public class Ninja {
    String nome, aldeia;
    int idade;
    boolean hokage;


    public void Chidori(){
        System.out.println("Chidori !!!");
    }

    // quando tem return é necessario
    // armazenar em uma variavel para exibir o conteudo de retorno
    public String ToCerto(){
        return "To certo datebaio";
    }

    public Boolean PodeSerHokage(int idade, int experiencia){
        hokage = idade >= 29 && experiencia >= 100;
        return hokage;
    }

    public void SocaSakura(){
        System.out.println("Socao na tua cara seu merda !!!");
    }

}
