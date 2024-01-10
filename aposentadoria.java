import java.util.Scanner;

public class aposentadoria {

    public static void main(String[] args) {
        Scanner fiscal = new Scanner (System.in);

        int idade;
        int tempodeservico;

        System.out.print("Qual a sua idade?: ");
        idade = fiscal.nextInt();

        System.out.print("A quanto tempo você trabalha?: ");
        tempodeservico = fiscal.nextInt();

        Boolean aposentadoria;

        if (idade >= 55 && tempodeservico >=25) {
            aposentadoria = true;
        }else{
            aposentadoria=false;
        }

        if (aposentadoria) {
            System.out.print("Você está apto para se aposentar");
            
        }else{
            System.out.print("Você não pode se aposentar ainda...");
        }

    }
}