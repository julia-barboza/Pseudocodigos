import java.util.Scanner;

public class VerificadorDeTriangulo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Digite o primeiro lado do triângulo: ");
	        int a = scanner.nextInt();
	        
	        System.out.println("Digite o segundo lado do triângulo: ");
	        int b = scanner.nextInt();
	        
	        System.out.println("Digite o terceiro lado do triângulo: ");
	        int c = scanner.nextInt();

	        if (a + b > c && a + c > b && b + c > a) {
	            if (a == b && b == c) {
	                System.out.println("O triângulo é equilátero.");
	            } else if (a == b || b == c || a == c) {
	                System.out.println("O triângulo é isósceles.");
	            } else {
	                System.out.println("O triângulo é escaleno.");
	            }
	        } else {
	            System.out.println("Não é um triângulo.");
	        }
	        scanner.close();
	    }
	}
