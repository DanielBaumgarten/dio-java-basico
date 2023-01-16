package controle.switch1;

public class SwitchFerias {

    public static void main (String[] args){
        String mes = "Março";
        switch(mes){
            case "Janeiro":
            case "Julho":
            case "Dezembro":
            System.out.println("Férias");
            break;
            case "Fevereiro":
            case "Março":
            case "Abril":
            case "Junho":
            case "Agosto":
            case "Setembro":
            case "Novembro":
            System.out.println("Atendimento de Segunda a Sábado. Horário: 08:00 até às 19:00, sem fechar ao meio dia");
            break;

        default:
        System.out.println("Favor digitar corretamente o mês, conforme este exemplo: 'Dezembro'");
        }
    }
}
