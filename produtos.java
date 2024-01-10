import java.util.Scanner;

public class produtos {

    public static void main(String[] args) {
        Scanner leitora = new Scanner (System.in);

        System.out.print ("Quantas bolachas deseja levar?: ");
        int bolachas = leitora.nextInt();

        double preço = 1.50;

        double precoFinal = (preço*bolachas);

        if (bolachas >= 10) {
            System.out.println("\nValor da Compra: R$"+ (precoFinal*0.9));
            
        } else{
            System.out.println("\nValor da Compra: R$"+ (preço*bolachas));
        }
    }
    
}
