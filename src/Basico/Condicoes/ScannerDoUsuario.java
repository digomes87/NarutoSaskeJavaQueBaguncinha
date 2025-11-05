package Basico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        System.out.println("Informe o nome do Ninja");
        Scanner scn =  new Scanner(System.in);
        String nomeNinja = scn.nextLine();

        System.out.println(nomeNinja);
        scn.close();
    }
}
