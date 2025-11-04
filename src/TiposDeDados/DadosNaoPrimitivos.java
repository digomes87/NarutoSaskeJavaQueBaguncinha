package TiposDeDados;

import java.util.Locale;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        String nome = "naruto uzumaki";
        String nomeCorrigido = nome.toUpperCase();

        System.out.println("Texto com upperCase -> "+ nomeCorrigido +" Texto sem normalizacao -> "+ nome);

    }
}
