import java.util.Scanner;
public class CountLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int numloops = input.nextInt();

		int total = 0 ;
		for (int i = 1; i <= numloops; i++) {
			total += i; }
		System.out.println("FOR total: " + total);

		//Now to do a reset and create a while loop, will do the same for do while loop
		total = 0;
		int i = 1;
		while(i <= numloops) {
			total += i;
			i++;}
		System.out.println("WHILE Total: " + total);

		//do while
		total = 0;
		i = 1;
		do {
			total += i;
			i++;
		} while (i <= numloops);
		System.out.println("DO WHILE Total: " + total);


	}
}