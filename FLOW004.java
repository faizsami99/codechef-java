
import java.util.Scanner;
import java.math.BigInteger;


public class FLOW004 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int totalCase = scr.nextInt();
		long num;
		int first;
		int last;
		for(int i=0; i<totalCase;i++){
			num = scr.nextLong();
			first = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0)));
			last = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(String.valueOf(num).length()-1)));
			System.out.println(first + last);
		}		
	}
}

