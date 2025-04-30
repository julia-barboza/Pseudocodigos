import java.util.Random;
import java.util.Scanner;

public class NumerosMagicos {
	public static void main(String[] args) {
	    Random random = new Random();
	    int[] numerosMagicos = new int[5];
	    for (int i = 0; i < 5; i++) {
	        numerosMagicos[i] = random.nextInt(50) + 1;
	    }

	    Scanner scanner = new Scanner(System.in);
	    int acertos = 0;

	    System.out.println("Tente adivinhar os 5 números mágicos (de 1 a 50):");
	    for (int i = 0; i < 5; i++) {
	        int palpite = scanner.nextInt();
	        for (int j = 0; j < 5; j++) {
	            if (palpite == numerosMagicos[j]) {
	                acertos++;
	                break;
	            }
	        }
	    }

	    System.out.println("Você acertou " + acertos + " número(s).");
	    scanner.close();
	}

}
