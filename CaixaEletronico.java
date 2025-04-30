import java.util.Scanner;

public class CaixaEletronico {
	
}
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    double saldo = 0;

	    while (true) {
	        System.out.println("Escolha uma opção:");
	        System.out.println("1. Ver saldo");
	        System.out.println("2. Depositar");
	        System.out.println("3. Sacar");
	        System.out.println("4. Sair");

	        int opcao = scanner.nextInt();

	        switch (opcao) {
	            case 1:
	                System.out.println("Seu saldo é: R$" + saldo);
	                break;
	            case 2:
	                System.out.println("Digite o valor a depositar:");
	                double deposito = scanner.nextDouble();
	                saldo += deposito;
	                System.out.println("Depósito realizado. Seu novo saldo é: R$" + saldo);
	                break;
	            case 3:
	                System.out.println("Digite o valor a sacar:");
	                double saque = scanner.nextDouble();
	                if (saque <= saldo) {
	                    saldo -= saque;
	                    System.out.println("Saque realizado. Seu novo saldo é: R$" + saldo);
	                } else {
	                    System.out.println("Saldo insuficiente.");
	                }
	                break;
	            case 4:
	                System.out.println("Saindo...");
	                return;
	            default:
	                System.out.println("Opção inválida.");
	        }
	    }
	}

