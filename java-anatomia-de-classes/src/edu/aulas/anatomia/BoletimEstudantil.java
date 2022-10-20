package edu.aulas.anatomia;

import javax.lang.model.util.ElementScanner14;

public class BoletimEstudantil {
    
    public static void main(String [] args) {
        int mediaFinal = 5;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA DE MINERVA");
        else 
            System.out.println("APROVADO");
        
    }
}
