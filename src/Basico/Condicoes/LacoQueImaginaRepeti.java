package Basico.Condicoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LacoQueImaginaRepeti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> ninjas = new ArrayList<>(List.of("Naruto", "Sakura", "Sasuke"));

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== SISTEMA NINJA ===");
            System.out.println("1. Listar ninjas");
            System.out.println("2. Adicionar ninja");
            System.out.println("3. Remover ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("Ninjas: " + ninjas);
                    break;
                case 2:
                    System.out.print("Nome do novo ninja: ");
                    String novoNinja = scanner.nextLine();
                    if (!novoNinja.isBlank() && !ninjas.contains(novoNinja)) {
                        ninjas.add(novoNinja);
                        System.out.println(" Ninja adicionado!");
                    }
                    break;
                case 3:
                    System.out.print("Nome do ninja a remover: ");
                    String removerNinja = scanner.nextLine();
                    if (ninjas.remove(removerNinja)) {
                        System.out.println(" Ninja removido!");
                    } else {
                        System.out.println(" Ninja não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println(" Saindo do sistema...");
                    break;
                default:
                    System.out.println(" Opção inválida!");
            }
        }

        scanner.close();
    }
}
