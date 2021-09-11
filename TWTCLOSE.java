
import java.util.Scanner;

public class TWTCLOSE{
	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);

		int totalTweets = src.nextInt();

		int[] openClose = new int[totalTweets];

		for(int i=0;i<totalTweets;i++){
			openClose[i] = 0;
		}
		int totalClicked = src.nextInt();
		String cliked;
		int countOne = 0;
		src.nextLine();
		for(int i=0;i<totalClicked;i++){
			countOne=0;
			cliked = src.nextLine();
			if(cliked.equals("CLOSEALL")){
				for(int j=0;j<totalTweets;j++){
				openClose[j] = 0;
				}
			}
			else{
				int c = Integer.parseInt(cliked.split(" ")[1]);
			
				if(openClose[c-1] == 0){
					openClose[c-1] = 1; 
				}

				else{
					openClose[c-1] = 0;
				}

			}

			for(int p=0;p<totalTweets;p++){
				if(openClose[p] == 1){
					countOne++;
				}
			}

			System.out.println(countOne);
			
		}

	}
}