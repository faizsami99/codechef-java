
import java.util.Scanner;

public class FLOW008{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCases = src.nextInt();
		int num;
		for(int i=0;i<totalCases;i++){
			num = src.nextInt();
			if(num < 10){
				System.out.println("Thanks for helping Chef!");
			}
			else{
				System.out.println(-1);
			}
		}
	}
}