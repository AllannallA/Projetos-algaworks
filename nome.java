import java.util.Scanner;

public class nome {
    public static void main(String[] args) {
        Scanner nome = new Scanner (System.in);

        System.out.print("Digite o seu nome: ");
        String primeiro = nome.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = nome.nextLine();

        System.out.print("\nO seu nome é: "+primeiro+" "+sobrenome);

    }
    
}
