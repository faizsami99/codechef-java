
import java.util.Scanner;

public class FLOW013{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCases = src.nextInt();
		int a1,a2,a3;
		for(int i=0;i<totalCases;i++){
			a1 = src.nextInt();
			a2 = src.nextInt();
			a3 = src.nextInt();
			if((a1 + a2 + a3) == 180){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}

/*
3 
40 40 100
45 45 90
180 1 1

*/