
import java.util.*;

public class HEADBOB{
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int totalCase = scr.nextInt();
		int totalAlphabet;
		String string = "";
		for(int i=0;i<totalCase;i++){
			string = "";
			totalAlphabet = scr.nextInt();
			while(string.length() != totalAlphabet){
				string = scr.next();
			}
			if(string.contains("I")){
				System.out.println("INDIAN");
			}
			else{
				if(!string.contains("Y")){
					System.out.println("NOT SURE");
				}
				else{
					System.out.println("NOT INDIAN");
				}
			}
		}
	}
}
