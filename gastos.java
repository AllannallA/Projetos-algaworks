import java.util.Scanner;
public class gastos{
    public static void main(String[] args) {
        Scanner gasto = new Scanner (System.in);

        Double valortotal = 0.0;

        System.out.print("Quanto foi gasto com a conta de luz?: ");
        Double luz = gasto.nextDouble();

        System.out.print("Quanto foi gasto com a água?: ");
        Double agua = gasto.nextDouble();

        System.out.print("Quanto foi gasto com o telefone?: ");
        Double telefone = gasto.nextDouble();

        System.out.print("Quanto foi gasto com a escola?: ");
        Double escola = gasto.nextDouble();

        System.out.print("Quanto foi gasto com o cartão?: ");
        Double cartao = gasto.nextDouble();

        System.out.print("Quanto foi gasto com o supermercado?: ");
        Double supermercado = gasto.nextDouble();
            
         valortotal += luz;
         valortotal += agua;
         valortotal += telefone;
         valortotal += escola;
         valortotal += cartao;
         valortotal += supermercado;

         System.out.println("\nO gasto total da família foi de: R$"+valortotal);
    }
}