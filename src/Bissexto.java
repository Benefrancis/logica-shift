import java.util.Scanner;

/**
 * Faça um programa que escreva se um ano informado pelo usuário é bissexto ou não.
 * Um ano é bissexto quando é (divisível por 400) ou é (divisível por 4 e não por 100).
 */
public class Bissexto {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Programa para verificar se um ano é bissexto");
        System.out.println("Informe o ano: ");
        var ano = leitor.nextInt();

        boolean bissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);

        //if ternário
        String msg = bissexto ? " é " : " não é ";

        System.out.println(ano + msg + "bissexto!");
        
        leitor.close();
    }

}
