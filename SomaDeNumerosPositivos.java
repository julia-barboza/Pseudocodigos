import java.util.Scanner;
public class SomaDeNumerosPositivos {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;
	        int numero;

	        do {
	            System.out.println("Digite um número (negativo para sair): ");
	            numero = scanner.nextInt();
	            if (numero >= 0) {
	                soma += numero;
	            }
	        } while (numero >= 0);

	        System.out.println("A soma dos números positivos é: " + soma);
	        
	        scanner.close();
	    }
	}

