package Basico.Condicoes;

import java.util.Scanner;

public class EstudoDoSwitCase {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha um personagem");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sakura Urami");
        System.out.println("3 - Kakashi");
        System.out.println("4 - Satoro");

        int escolhaDoUsuario = caixaDeTexto.nextInt();

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Naruto");
                break;
            case 2:
                System.out.println("Sakura");
                break;
            case 3:
                System.out.println("Kakashi");
                break;
            case 4:
                System.out.println("Gojo");
                break;
            default:
                System.out.println("Precisa selecionar um dos personagens Listados !");
        }

        caixaDeTexto.close();
    }
}
