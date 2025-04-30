	import java.util.Random;
	import java.util.Scanner;

public class CorridaMaluca {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Random random = new Random();

	    System.out.println("Digite o nome do primeiro corredor:");
	    String corredor1 = scanner.nextLine();
	    System.out.println("Digite o nome do segundo corredor:");
	    String corredor2 = scanner.nextLine();
	    System.out.println("Digite o nome do terceiro corredor:");
	    String corredor3 = scanner.nextLine();

	    int volta = 1;
	    int[] posicoes = new int[3];  // Guarda as posições de cada corredor

	    while (volta <= 5) {
	        System.out.println("Volta " + volta + ":");

	        // Movimentação aleatória
	        posicoes[0] += random.nextInt(10);
	        posicoes[1] += random.nextInt(10);
	        posicoes[2] += random.nextInt(10);

	        // Exibir posições
	        System.out.println(corredor1 + ": " + posicoes[0] + " metros");
	        System.out.println(corredor2 + ": " + posicoes[1] + " metros");
	        System.out.println(corredor3 + ": " + posicoes[2] + " metros");

	        volta++;
	    }

	    // Definir o vencedor
	    int vencedor = 0;
	    if (posicoes[1] > posicoes[vencedor]) vencedor = 1;
	    if (posicoes[2] > posicoes[vencedor]) vencedor = 2;

	    System.out.println("O vencedor é: " + (vencedor == 0 ? corredor1 : vencedor == 1 ? corredor2 : corredor3));
	    
	    scanner.close();
	}
	}
