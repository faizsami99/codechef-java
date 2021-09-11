import java.util.Scanner;

public class HOWMANY{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int number = src.nextInt();
		String strNumber = String.valueOf(number);
		if(strNumber.length() > 3){
			System.out.println("More than 3 digits");
		}
		else{
			System.out.println(strNumber.length());
		}
	}
}