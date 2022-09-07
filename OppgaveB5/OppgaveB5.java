package OppgaveB5;

import java.util.Scanner;

public class OppgaveB5 {

	public static void main(String[] args) {
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv inn poengsum");
		i = scan.nextInt();
		scan.close();
		

		if (i>=90 && i<=100) {
			System.out.println("A");
		}
		else if (i>=80 && i<=89) {
			System.out.println("B");
		}
		else if (i>=60 && i<=79) {
			System.out.println("C");
		}
		else if (i>=50 && i<=59) {
			System.out.println("D");
		}
		else if (i>=40 && i<=49) {
			System.out.println("E");
		}
		else if (i>=0 && i<=39) {
			System.out.println("F");
		}
		else{
			System.out.println("Ugyldig tall, vennligst prøv igjen");
		}
	}
	}
