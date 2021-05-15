
import java.util.*;

public class LUCKFOUR{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCases = src.nextInt();
		int number;
		int counter; 
		String stringNumber;
		for(int j=0;j<totalCases;j++){
			counter = 0;
			number = src.nextInt();
			stringNumber = String.valueOf(number);
			for(int i=0;i<stringNumber.length();i++){
				if("4".equals(String.valueOf(stringNumber.charAt(i)))){
					counter++;
				}
			}
			System.out.println(counter);
		}
	}
}