
import java.util.Scanner;

public class VOWELTB{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   
		String str = "AEIOU";

		char c = sc.next().charAt(0);   

		char b = Character.toUpperCase(c);

		if(str.indexOf(b) >= 0){
			System.out.println("Vowel");
		}
		else{
			System.out.println("Consonant");
		}

	}
}