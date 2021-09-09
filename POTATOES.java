
import java.util.Scanner;

public class POTATOES{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCases = src.nextInt();
		while(totalCases --> 0){
			int xField = src.nextInt();
			int yField = src.nextInt();

			int sum = xField + yField;

			PrimeNumber.nextPrimeNumber(sum);

		}
	}

}

class PrimeNumber{
	public static void nextPrimeNumber(int number){
		
		int counter = 0;
		int inc = 0;
		while(number++>0){
			counter = 0;
			inc++;
			int num1 = number;
			while(num1-->0){
				if((number)%(num1+1) == 0){
					counter++;
				}
				if(counter>2){
					break;
				}
			}
			if(counter == 2){
				break;
			}
		}

		if(counter == 2){
			System.out.println(inc);
		}
	}
}


