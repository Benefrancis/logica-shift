
import java.util.Scanner;

/**
 * Crie um programa Java que leia a velocidade de um carro e a velocidade máxima para a via:
 * <p>
 * 1. Informe 50 reais se estiver até 10km/h acima;
 * <p>
 * 2. Informe 100 reais se estiver entre 11km/h e 30km/h acima;
 * <p>
 * 3. Informe 300 reais se estiver acima de 31km/h acima.
 */
public class MultaDeTransito {


    public static void main(String[] args) {
    	
        float via, veiculo, multa;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Infomre a velocidade máxima permitida para a via: ");
        via = leitor.nextFloat();

        System.out.println("Informe a velocidade do veículo: ");
        veiculo = leitor.nextFloat();


        if (veiculo > via) {
        	
            if (veiculo - via > 30) {
                multa = 300;
            } else if (veiculo - via > 10) {
                multa = 100;
            } else {
                multa = 50;
            }
            
            System.out.printf("Multa aplicada de R$ %,.2f%n", multa);
            System.out.println("Motivo: Trafegar com velocidade superior à permitida.");
            
        } else {
            System.out.println("Motorista prudente!");
        }
        leitor.close();
    }


}
