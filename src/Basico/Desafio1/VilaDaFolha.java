package Basico.Desafio1;

public class VilaDaFolha {
    public static void main(String[] args) {
        // Entry banner (removed emojis per coding standards)
        System.out.println("SISTEMA DE MISSÕES - VILA DA FOLHA");
        System.out.println("==========================================\n");

        // Criando missões
        Missao missao1 = new Missao("Proteger o construtor da ponte", "Rank C");
        Missao missao2 = new Missao("Capturar o Itachi Uchiha", "Rank S");
        Missao missao3 = new Missao("Entregar mensagem ao Hokage", "Rank D");
        Missao missao4 = new Missao("Investigar organização Akatsuki", "Rank A");

        // Criando ninjas
        Ninja naruto = new Ninja("Naruto Uzumaki", 17, missao1);
        Ninja sasuke = new Ninja("Sasuke Uchiha", 17, missao2);
        Ninja sakura = new Ninja("Sakura Haruno", 17, missao3);

        // Exibindo informações iniciais
        System.out.println("--- STATUS INICIAL DOS NINJAS ---");
        naruto.exibirInfo();
        sasuke.exibirInfo();
        sakura.exibirInfo();

        // Simulando progresso das missões
        System.out.println("--- PROGRESSO DAS MISSÕES ---");
        naruto.completarMissaoAtual();
        sakura.completarMissaoAtual();

        System.out.println("\n--- ATRIBUINDO NOVAS MISSÕES ---");
        // Naruto completa missão e recebe nova
        naruto.setMissaoAtual(missao4);

        // Sasuke falha na missão inicial
        System.out.println(sasuke.getNome() + " falhou em capturar o Itachi!");
        sasuke.setMissaoAtual(new Missao("Treinamento com Kakashi", "Rank B"));

        System.out.println("\n--- STATUS FINAL DOS NINJAS ---");
        naruto.exibirInfo();
        sasuke.exibirInfo();
        sakura.exibirInfo();

        // Resumo
        System.out.println("==========================================");
        System.out.println("RELATÓRIO FINAL DA VILA DA FOLHA");
        System.out.println("Total de ninjas: 3");
        System.out.println("Missões em andamento: " + contarMissoesAtivas(naruto, sasuke, sakura));
        System.out.println("Missões concluídas: " + contarMissoesConcluidas(naruto, sasuke, sakura));
    }

    // Counts active missions among provided ninjas
    public static int contarMissoesAtivas(Ninja... ninjas) {
        int count = 0;
        for (Ninja ninja : ninjas) {
            Missao missao = ninja.getMissaoAtual();
            if (missao != null && !missao.isConcluida()) {
                count++;
            }
        }
        return count;
    }

    // Counts concluded missions among provided ninjas
    public static int contarMissoesConcluidas(Ninja... ninjas) {
        int count = 0;
        for (Ninja ninja : ninjas) {
            Missao missao = ninja.getMissaoAtual();
            if (missao != null && missao.isConcluida()) {
                count++;
            }
        }
        return count;
    }
}
