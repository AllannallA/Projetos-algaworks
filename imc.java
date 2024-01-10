import java.util.Scanner;

public class imc {
    public static void main (String []args){

        Scanner scan = new Scanner (System.in);

        System.out.print("Informe sua altura: ");
        double altura = scan.nextDouble();

        System.out.print("Informe seu peso: ");
        double peso = scan.nextDouble();

        double IMC = (peso / (altura * altura));

        System.out.printf("O seu IMC é exatamente:\n\n"+IMC);

    }


    
}
