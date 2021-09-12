
import java.util.Scanner;

public class NUMGAME{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCases = src.nextInt();
		while(totalCases-->0){
			int n = src.nextInt();

			if(n%2==0){
				System.out.println("ALICE");
			}
			else{
				System.out.println("BOB");
			}
		}
	}
}
