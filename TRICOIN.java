
import java.util.Scanner;

public class TRICOIN{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCases = src.nextInt();
		while(totalCases--> 0){
			int coins = src.nextInt();

			int height = 0;
			while(true){
				height++;
				int x = (height*(height+1)) / 2;
				if(x > coins){
					break;
				}
			}

			System.out.println(height-1);
		}
	}
}

