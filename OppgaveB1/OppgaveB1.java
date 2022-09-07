package OppgaveB1;

import java.util.Scanner;

public class OppgaveB1 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number range:");
		num = sc.nextInt();
		
		System.out.println("The list of Odd number from range");
		
		for (int i=1; i<=num; i++) {
			if(i%2 != 0) {
				System.out.println(i + "");
			}
		}

	}

}
