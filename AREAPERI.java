
import java.util.Scanner;

public class AREAPERI{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int lenght = src.nextInt();
		int breath = src.nextInt();
		int area = lenght * breath;
		int peri = 2*(lenght + breath);

		if(area > peri){
			System.out.println("Area");
			System.out.println(area);
		}
		else if (peri > area){
			System.out.println("Peri");
			System.out.println(peri);
			
		}
		else{
			System.out.println("Eq");
			System.out.println(peri);
		}
	}
}
