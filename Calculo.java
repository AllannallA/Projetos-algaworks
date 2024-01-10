import java.util.Scanner;

public class Calculo {

    public static void main (String[]args){

        Scanner olho = new Scanner (System.in);

        System.out.print("Digite um núemro: ");
        int numero = olho.nextInt();

        int quadrado = (numero*numero);

        System.out.println ("\n"+quadrado);


    }
}