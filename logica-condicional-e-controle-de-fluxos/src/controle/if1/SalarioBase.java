package controle.if1;


public class SalarioBase {

    public static void main (String[] args){

        double salarioMensal = 1986.58d;
        double mediaSalario = 2500.00d;
        
        int quantidadeDependentes = 4;
        int mediaDependentes = 5;
        
        
        Boolean  salarioBaixo = salarioMensal < mediaSalario;
        Boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionario recebe auxilio");
        }
        else {
            System.out.println("Não recebe auxílio");
        }
    


    }

}
