import java.util.Scanner;

public class Cofrinhio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		int quantidade = 0;
		double valor;

		do {
		System.out.print("Digite o valor da moeda (0 para parar): R$ ");
		valor = sc.nextDouble();

		if (valor > 0) {
		total += valor;
		quantidade++;
		}
		} while (valor != 0);

		System.out.println("Você inseriu " + quantidade + " moedas.");
		System.out.println("Total economizado: R$ " + total);
		sc.close();
		}
	}