package Basico.Condicoes;

import java.util.ArrayList;
import java.util.List;

public class AbacaxiEntrandoNoRabo {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>(List.of("Naruto", "Sakura", "Sasuke"));

        System.out.println("Time Inicial: "+ ninjas);

        // add mais ninjas
        adicionando(ninjas, "Kakashi");
        adicionando(ninjas, "Gojo");
        adicionando(ninjas, "Rock Lee A lenda");


        System.out.println("Time atualizado "+ ninjas);
    }

    public static void adicionando(List<String> lista, String nome){
        if (nome != null && !nome.trim().isEmpty() && !lista.contains(nome)){
            lista.add(nome);
            System.out.println("Ninja adicionado: "+ nome);
        }
    }
}
