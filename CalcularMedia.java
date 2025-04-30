import java.util.Scanner;
public class CalcularMedia {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    double soma = 0;
	    int contador = 0;
	    double media;

	    while (true) {
	        System.out.println("Digite a nota do aluno (ou -1 para encerrar):");
	        double nota = scanner.nextDouble();
	        if (nota == -1) {
	            break;
	        }
	        soma += nota;
	        contador++;
	    }

	    if (contador > 0) {
	        media = soma / contador;
	        System.out.println("A média do aluno é: " + media);
	        if (media >= 7) {
	            System.out.println("Aprovado!");
	        } else if (media >= 4) {
	            System.out.println("Recuperação.");
	        } else {
	            System.out.println("Reprovado.");
	        }
	    } else {
	        System.out.println("Nenhuma nota foi inserida.");
	        
	    	scanner.close();
	    }
	}
	}