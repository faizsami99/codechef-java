
import java.util.Scanner;

public class CHN09{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCases = src.nextInt();
		src.nextLine
		();
		while(totalCases-->0){
			String str = src.nextLine();
			int a = str.replace("b", "").length();
			int b = str.replace("a", "").length();

			if(a == 0 || b == 0){
				System.out.println(0);
			}
			else if (a == b) {
				System.out.println(a);
			}
			else if(a>b){
				System.out.println(b);
			}
			else{
				System.out.println(a);
			}

		}
	}
}
