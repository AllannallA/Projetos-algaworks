import java.util.Scanner;

public class empresa {

    public static void main(String[] args) {
        Scanner grana = new Scanner(System.in);

        int salario = 1000;
        int metaLucro = 100000;

        System.out.print("Digite o lucro total: ");
        double lucroAnual = grana.nextDouble();

        if (lucroAnual >= metaLucro) {
            System.out.println("\nA meta da empresa foi atingida! Lucro: " + lucroAnual);
            System.out.println("O seu salário é de: " + salario * 2);
        } else if (lucroAnual >= metaLucro * 0.8) {
            System.out.println("\nA empresa atingiu 80% da meta. Lucro: " + lucroAnual);
            System.out.println("O seu salário é de: " + (salario + (salario * 0.8)));
        } else {
            System.out.println("\nA empresa não atingiu a meta. Lucro: " + lucroAnual);
            System.out.println("O seu salário é de: " + salario);
        }
    }
}
