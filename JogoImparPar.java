import java.util.Random;
import java.util.Scanner;

public class JogoImparPar {

	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       
       
      System.out.println("Escolha um número: ");
      int numeroUsuario = scanner.nextInt();
      
      System.out.println("Escolha entre par ou ímpar: ");
      String escolhaUsuario = scanner.next();
      
      int numeroSistema = random.nextInt(100) + 1;
      
      System.out.println("Você escolher: " + numeroUsuario);
      System.out.println("O sistema escolheu: " + numeroSistema);
      
      int soma = numeroUsuario + numeroSistema;
      
      if (soma % 2 == 0) {
    	  if (escolhaUsuario.equals("par")) {
              System.out.println("Você venceu! A soma é par.");
          } else {
              System.out.println("O sistema venceu! A soma é par.");
          }
      } else {
          if (escolhaUsuario.equals("ímpar")) {
              System.out.println("Você venceu! A soma é ímpar.");
          } else {
              System.out.println("O sistema venceu! A soma é ímpar.");
      
}
      }
	scanner.close();
	}
}
