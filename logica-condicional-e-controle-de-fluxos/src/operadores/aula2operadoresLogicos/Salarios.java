package operadores.aula2operadoresLogicos;

public class Salarios {

    public static void main(String[] args) {
    double salarioMensal = 1986.58d;
    double mediaSalario = 2500.00d;
    
    int quantidadeDependentes = 4;
    int mediaDependentes = 3;
    
    System.out.println((salarioMensal < mediaSalario) && quantidadeDependentes >= mediaDependentes);
    }
    }