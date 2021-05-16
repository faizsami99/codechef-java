import java.util.Scanner;

public class FSQRT {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int totalCases = src.nextInt();
        int number;
        for(int i=0;i<totalCases;i++){
            number = src.nextInt();
            number = (int) Math.round(Math.sqrt(number));
            System.out.println(number);
        }
    }
}
/*