import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Pergunta 1: Qual a capital do Brasil?");
	    System.out.println("1. Brasília");
	    System.out.println("2. Rio de Janeiro");
	    System.out.println("3. São Paulo");
	    int resposta1 = scanner.nextInt();

	    System.out.println("Pergunta 2: Qual o maior planeta do sistema solar?");
	    System.out.println("1. Marte");
	    System.out.println("2. Júpiter");
	    System.out.println("3. Saturno");
	    int resposta2 = scanner.nextInt();

	    System.out.println("Pergunta 3: Qual o maior oceano?");
	    System.out.println("1. Atlântico");
	    System.out.println("2. Índico");
	    System.out.println("3. Pacífico");
	    int resposta3 = scanner.nextInt();

	    int pontos = 0;

	    switch (resposta1) {
	        case 1: pontos++; break;
	        default: break;
	    }

	    switch (resposta2) {
	        case 2: pontos++; break;
	        default: break;
	    }

	    switch (resposta3) {
	        case 3: pontos++; break;
	        default: break;
	    }

	    System.out.println("Você acertou " + pontos + " de 3 perguntas.");
	    
	    scanner.close();
	}

}
