package OppgaveB4;

import java.util.Scanner;

public class OppgaveB4 {

	public static void main(String[] args) {
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv inn Bruttoinntekt");
		i = scan.nextInt();
		scan.close();
		
		if (i>=934051) {
			System.out.println("Trinn 4, 14.52%" + "\n" + i*0.1452);
		}
		else if (i>=580651) {
			System.out.println("Trinn 3, 11.52%" + "\n" + i*0.1152);
		}
		else if (i>=230951) {
			System.out.println("Trinn 2, 2.41%" + "\n" +  i*0.0241);
			
		}
		else if (i>=164101) {
			System.out.println("Trinn 1, 0.93%" + "\n" + i*0.093);
		}
		else{
			System.out.println("Trinn 0," + "\n" + i*0);
		}
	}

}

