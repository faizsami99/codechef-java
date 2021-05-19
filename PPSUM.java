
import java.util.Scanner;

public class PPSUM{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCases = src.nextInt();
		int num;
		int summation;
		for(int i=0;i<totalCases;i++){
			num = src.nextInt();
			summation = src.nextInt();
			for(int j=0;j<num;j++){
				summation = Sum.sum(summation);
			}
			System.out.println(summation);
		}
	}
}

class Sum{
	public static int sum(int num){
		return (num*(num + 1))/2;		
	}
}