
import java.util.Random;
import java.util.Scanner;

/**
 * https://www.pensador.com/lista_de_elogios_e_frases_para_elogiar_alguem/
 */
public class Elogios {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		byte opcao;

		String nome;

		String mensgemDeBoasVindas = "PROGRAMA ELOGIADOR ";

		System.out.println("Agora informe o nome da pessoa que deseja elogiar: ");

		nome = leitor.nextLine();


		System.out.println(" Olá " +

				mensgemDeBoasVindas + """

						Selecione a opção desejada:

						1-Elogio profissional
						2-Elogio físico
						3-Elogio pessoal

						""");

		opcao = leitor.nextByte();

		Random r = new Random();

		var elogio = "";

		switch (opcao) {

		case 1 -> elogio = r.nextInt(2) == 0 ? "a sua dedicação é incrível!" : "é ótimo trabalhar ao seu lado!";

		case 2 -> elogio = r.nextInt(2) == 0 ? "você é uma pessoa muito forte!" : "o brilho dos seus olhos me encanta!";

		case 3 -> elogio = r.nextInt(2) == 0 ? "você é uma pessoa muito altruísta!"
				: "sua bondade me inspira a ser uma pessoa melhor.!";

			default -> {
				System.out.println("Opção inválida");
				System.exit(0);
			}
		}

		System.out.println(nome + ", " + elogio);

		leitor.close();

	}

}