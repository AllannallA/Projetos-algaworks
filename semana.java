import java.util.Scanner;
public class semana {
    public static void main(String[] args) {
        Scanner diario = new Scanner (System.in);

        System.out.print("DIGITE O DIA DA SEMANA: ");
        int diaDaSemana = diario.nextInt();

        if (diaDaSemana==1) {
            System.out.println("O dia da semana é: Domingo"); 
        }else if(diaDaSemana==2){
            System.out.println("O dia da semana é: Segunda-Feira");
        }else if(diaDaSemana==3){
            System.out.println("O dia da semana é: Terça-Feira");
        }else if(diaDaSemana==4){
            System.out.println("O dia da semana é: Quarta-Feira");
        }else if(diaDaSemana==5){
            System.out.println("O dia da semana é: Quinta-Feira");
        }else if(diaDaSemana==6){
            System.out.println("O dia da semana é: Sexta-Feira");
        }else if(diaDaSemana==7){
            System.out.println("O dia da semana é: Sábado");
        }else{
            System.out.println("Dia inválido....");
        }
    }
}
