package edu.aulas.anatomia;
public class MinhaClasse {

    public static void main (String[] args) {

        String primeiroNome = "Daniel";
        String segundoNome = "Baumgarten";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println("Resultado do método " + nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
