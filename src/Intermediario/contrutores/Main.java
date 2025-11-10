package Intermediario.contrutores;

public class Main {
    public static void main(String[] args) {
        Hokages hashirama = new Hokages();
        hashirama.nome = "Hashirama";
        System.out.println(hashirama.nome);

        Hokages senji = new Hokages("Senji");
        System.out.println(senji.nome);

        Hokages tsunade = new Hokages("Tsunade",53, true);
        System.out.println(tsunade.nome);
        System.out.println(tsunade.idade);
        System.out.println(tsunade.vivoMorto);
    }
}
