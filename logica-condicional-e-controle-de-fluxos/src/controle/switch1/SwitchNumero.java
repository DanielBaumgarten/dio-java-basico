package controle.switch1;

public class SwitchNumero {
    
    public static void main(String[] args){

    int numero = 15;
    switch(numero){
        case 1:
        case 2:
        case 3:
            System.out.println("Certo");
            break;
        case 4:
            System.out.println("Está perto");
            break;
        case 5:
            System.out.println("Frio");
            break;
        default:
            System.out.println("Polo Norte");
            break;


    }

    }
}
