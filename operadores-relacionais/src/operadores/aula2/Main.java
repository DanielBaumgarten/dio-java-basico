package operadores.aula2;

public class Main {

public static void main(String[] args) {
double salarioMensal = 1986.58d;
double mediaSalario = 1500.00d;

int quantidadeDependentes = 4;
int mediaDependentes = 2;

System.out.println((salarioMensal < mediaSalario) && quantidadeDependentes >= mediaDependentes);
}
}