
import java.util.Scanner;

public class REMISS{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCase = src.nextInt();
		int firstCount;
		int secondCount;
		for(int i=0;i<totalCase;i++){
			firstCount = src.nextInt();
			secondCount = src.nextInt();
			if(firstCount > secondCount){
				System.out.println(firstCount + " " + (firstCount + secondCount));
			}
			else{
				System.out.println(secondCount + " " + (firstCount + secondCount));
			}
		}
	}
}