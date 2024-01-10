import java.util.Scanner;

public class notas {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print ("Digite sua 1ª nota: ");
        double nota = ler.nextDouble();

         System.out.print ("Digite sua 2ª nota: ");
        double nota2 = ler.nextDouble();

        double notaFinal = (nota+nota2)/2;

        boolean media = (notaFinal >= 7);

        if (media) {
            System.out.print("\n"+notaFinal);
            System.out.println("\nAPROVADO");
            
        } else {
            System.out.print("\n"+notaFinal);
            System.out.println("\nREPROVADO");
        }


    }
    
}
