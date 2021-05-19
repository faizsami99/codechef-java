
import java.util.Scanner;

public class DIFFSUM{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int first = src.nextInt();
		int second = src.nextInt();
		if(first>second){
			System.out.println(first-second);
		}
		else{
			System.out.println(first + second);
		}
	}
}
