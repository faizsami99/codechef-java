
import java.util.Scanner;
import java.math.BigInteger;

public class Fctrl2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
		    int n=s.nextInt();
		    BigInteger fact=new BigInteger("1");
            for(int i=n;i>1;i--){
                fact=fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact.toString());
		}
	}
}