
import java.util.Scanner;

public class CHOPRT{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCase = src.nextInt();
		int first;
		int second;
		for(int i=0;i<totalCase;i++){
			first = src.nextInt();
			second = src.nextInt();
			if(first>second)
				System.out.println(">");
			else if(first < second)
				System.out.println("<");
			else
				System.out.println("=");
		}
	}
}