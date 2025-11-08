package Intermediario.Desafio2;

public class Main {
    public static void main(String[] args) {
        // Class ninja
        System.out.println("=== Ninja =====");
        Ninja naruto = new Ninja("Naruto Uzumaki", 16, "Protetor da vila", "A","Em Andamento");
        naruto.mostrarInformacoes();

        System.out.println("\n=== Ninja Uchiha ===");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 18, "Capturar o Itachi", "S", "Concluida","Sharingan");
        sasuke.mostrarInformacoes();

        System.out.println("\n=== Metodo epscifico do Uchiha =====");
        sasuke.mostrarHabilidadeEspecial();

        System.out.println("\n=== O brabo chegou ! ===");
        Uchiha itachi = new Uchiha("Itachi Uchiha", 21, "Proteger Konoha", "S", "Concluida", "Mangekyou Sharingan");
        itachi.mostrarInformacoes();
    }
}
