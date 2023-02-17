import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float nota = 0;
		boolean continuar = false;
		int i = 0;
		var n = 0f;

		do {
			n = -1f;

			do {
				System.out.println("Informe a nora do " + (i + 1) + "º aluno");
				n = leitor.nextFloat();
			} while (n < 0  || n > 10);

			nota = nota + n;
			i++;
			System.out.println("Deseja cadastrar mais uma nota? true = SIM false = Não");
			continuar = leitor.nextBoolean();
		} while (continuar);

		System.out.printf("A média da sala é: %,.1f", (float) (nota / i));
		leitor.close();
	}

}
