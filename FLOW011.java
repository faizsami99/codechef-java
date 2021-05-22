
import java.util.Scanner;

public class FLOW011{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCase = src.nextInt();
		int salary;
		for(int i=0;i<totalCase;i++){
			salary = src.nextInt();
			if(salary < 1500){
				Below.belowSalary(salary);
			}
			else{
				Above.aboveSalary(salary);
			}		
		}
	}
}

class Above{
	public static void aboveSalary(int salary){
		double grossSalary = salary + 500 + salary*(0.98);
		System.out.println(grossSalary);
	}
}

class Below{
	public static void belowSalary(int salary){
		double grossSalary = salary + (salary*(0.1)) + (salary*(0.90));
		System.out.println(grossSalary);
	}
}

/*

3
1203
10042
1312

2406.00
20383.16
2624

*/
