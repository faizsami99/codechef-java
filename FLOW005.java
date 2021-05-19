
import java.util.*;

public class FLOW005{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCase = src.nextInt();
		int num;
		int count;
		for(int i=0;i<totalCase;i++){
			num = src.nextInt();
			count=0;
			while(num>0){
				System.out.println(num);
				if (num>=100){
		            count+=num/100;
		            num=num%100;
		        }
		        else if (num>=50){
		            count+=num/50;
		            num=num%50;
		        }
		        else if (num>=10){
		            count+=num/10;
		            num=num%10;
		        }
		        else if (num>=5){
		            count+=num/5; 
		            num=num%5;
		        }
		        else if (num>=2){
		            count+=num/2; 
		            num=num%2;
		        }
		        else if (num>=1){
		            count+=num/1; 
		            num=num%1;
		        }
			}
			System.out.println(count);
		}
	}
}

/*
3 
1200
500
242

12
5
7

*/