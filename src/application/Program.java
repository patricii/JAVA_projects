package application;

import entities.Account;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Entre com o codigo da conta: ");
		int number = sc.nextInt();
		System.out.print("Entre com o nome do cliente: ");
		sc.nextLine();
		String tempName = sc.nextLine();
		System.out.println("Deseja realizar um deposito inicial? s / n :");
		char option = sc.nextLine().charAt(0);
		if (option == 's') {

			System.out.println("Entre com o valor do deposito: ");
			double deposit = sc.nextDouble();
			account = new Account(tempName, number, deposit);

		} else
			account = new Account(tempName, number);

		System.out.println("Dados do Cliente: ");
		System.out.println(account.ToString());

		System.out.println("Valor do deposito: ");
		double newdeposit = sc.nextDouble();
		account.deposit(newdeposit);
		System.out.println();
		System.out.println("Dados do Atualizados: ");
		System.out.println(account.ToString());

		System.out.println();

		System.out.println("Valor do Saque: ");
		double newwithdraw = sc.nextDouble();
		account.withdraw(newwithdraw);
		System.out.println();
		System.out.println("Dados do Atualizados: ");
		System.out.println(account.ToString());

		sc.close();

	}

}
