
import java.util.Scanner;

public class TRIVALCH{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int a = src.nextInt();
		int b = src.nextInt();
		int c = src.nextInt();

		if(a+b>c && b+c>a && c+a>b){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}
}
