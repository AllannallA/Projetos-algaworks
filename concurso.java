import java.util.Scanner;
public class concurso {
    public static void main(String[] args) {
        Scanner prof = new Scanner (System.in);

        System.out.print("Digite sua nota em Mateámtica: ");
        int nota1 = prof.nextInt();
        System.out.print("Digite sua nota em Português: ");
        int nota2 = prof.nextInt();

        int media = nota1+nota2;

        if (media<150) {
            System.out.println("\nMedia insuficiente,Você não foi aprovado no concurso.....");
            
        }else if(nota1<60||nota2<60){
            System.out.println("\nVocê reprovou em uma das matérias, Você não foi aprovado no concurso.....");
        }else{
            System.out.println("\nParabéns, você foi aprovado no concurso!");
        }

    }
}
