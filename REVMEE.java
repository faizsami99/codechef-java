
import java.util.Scanner;

public class REVMEE{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		StackList st = new StackList();
		int n = src.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = src.nextInt();
		}
		String str = "";
		for(int j=n-1;j<=0;j--){
			str = str + " " + arr[i];
		}
		System.out.println(str.trim());
	}
}