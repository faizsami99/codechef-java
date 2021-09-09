
import java.util.Scanner;
import java.util.Arrays;

public class SNCKYEAR{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		Integer giveYears[] = {2010, 2015, 2016, 2017, 2019};
		
		int totalCases = src.nextInt();
		while(totalCases-->0){
			System.out.println("Enter: ");
			Integer year = src.nextInt();

			if(Arrays.asList(giveYears).contains(year)){
				System.out.println("HOSTED");
			}
			else{
				System.out.println("NOT HOSTED");
			}

		}
	}
}