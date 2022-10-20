package edu.aulas.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numeroUm é menor a numeroDois? " + simNao);

        String resultado = numero1 < numero2 ? "verdadeira":"falsa";
        System.out.println(resultado);

        // comparando textos ou objetos

        String nomeUm = "Daniel";
        String nomeDois = "Daniel";
        System.out.print(nomeUm == nomeDois);

        String nomUm = "Daniel";
        String nomDois = new String("Daniel");
        System.out.print(nomUm == nomDois);
        System.out.print(nomUm.equals(nomDois)); //metodo equals é utilizado para comparar objetos/conteúdo
    }
}
