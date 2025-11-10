package Intermediario;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.aldeia = "Folha";
        naruto.nome = "Naruto";
        int idade = naruto.idade = 18;
        String fraseNarutez = naruto.ToCerto();
        System.out.println(naruto.nome+ " Disse: "+fraseNarutez);
        naruto.ModoSabio();

        Boolean podeSerHokage = naruto.PodeSerHokage(idade, 50);
        String podeSerHokageString = podeSerHokage ? "Sim" : "Não";
        System.out.println("Naruto pode ser Hokage: "+podeSerHokageString);

        System.out.println("\n==== Ninja ========");

        Uchiha sasuke = new Uchiha();
        sasuke.aldeia = "Folha";
        String nomeNinjaU = sasuke.nome= "Sasuke";
        sasuke.idade = 19;
        System.out.println(nomeNinjaU);
        sasuke.SharingaAtivado();
        sasuke.Chidori();

        System.out.println("\n==== Ninja ========");

        Harumo sakura = new Harumo();
        sakura.aldeia = "Folha";
        String nomeNinja = sakura.nome = "Sakura";
        sakura.idade = 17;

        System.out.println("Ninja "+nomeNinja);
        sakura.SocaSakura();
        sakura.Cura();
        System.out.println("\n==== Ninja ========");


        Ryuga hinata = new Ryuga();
        String nome = hinata.nome = "Hinata";
        hinata.aldeia = "Folha";
        String tecnica = hinata.Byakuya();
        System.out.println(nome+" Ninja, ativando: "+tecnica);

        System.out.println("\n==== Ninja ========");

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto";
        boruto.aldeia = "Folha";
        boruto.idade = 9;
        boruto.AtivarJougan();
        boruto.AtivarKarma();
        boruto.ModoSabio();
    }
}
