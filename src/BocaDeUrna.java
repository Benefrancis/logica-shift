import java.util.Scanner;

public class BocaDeUrna {
	public static void main(String[] args) {
		
		
        Scanner leitor = new Scanner(System.in);
        
        byte idade;

        System.out.println("Por favor, digite a idade do passageiro.");
        idade = leitor.nextByte();

        if (idade < 16) {
            System.out.println("O passageiro não pode votar nem embarcar");
        } else if (idade > 64) {
            System.out.println("O voto do passageiro é opcional e ele pode embarcar");
        } else {
            if (idade >= 18) {
                System.out.println("O passageiro deve votar e pode embarcar");
            } else {
                System.out.println("O voto do passageiro é opcional e ele pode embarcar");
            }
        }
        leitor.close();
        
	}
}
