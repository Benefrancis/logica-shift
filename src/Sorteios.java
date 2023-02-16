import java.util.Random;

public class Sorteios {
	public static void main(String[] args) {

		Random r = new Random();

		int next = r.nextInt(2);

		System.out.println(next % 2);

	}
}
