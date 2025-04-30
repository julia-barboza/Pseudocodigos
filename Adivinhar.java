import java.util.Scanner;
import java.util.Random;
public class Adivinhar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int numeroAleatorio = random.nextInt(10) + 1;
		int tentativa;
		int numeroTentativas = 0;

		System.out.println("Tente adivinhar o número que eu escolhi entre 1 e 10.");

		do {
		System.out.println("Digite sua tentativa:");
		tentativa = scanner.nextInt();
		numeroTentativas++;

		if (tentativa < numeroAleatorio) {
		System.out.println("O número que estou pensando é maior");
		}
		if (tentativa > numeroAleatorio) {
		System.out.println("O número que estou pensando é menor");
		}
		if (tentativa == numeroAleatorio) {
		System.out.println("Parabéns! Você adivinhou o número em " + numeroTentativas + " tentativas!");
		}
		} while (tentativa != numeroAleatorio);

		scanner.close();
		}

	}