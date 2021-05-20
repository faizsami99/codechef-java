
import java.util.*;

class LAPIN{
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int totalCase = scr.nextInt();
		String inputString;
		List<String> sh;
		List<String> fh;
		for(int i=0;i<totalCase;i++){
			inputString = scr.next();
			int len = inputString.length();
			if(len % 2 == 0){
				String[] firstHalf = MutableString.mutableString(0,(len/2), inputString);
				String[] secondHalf = MutableString.mutableString((len/2),len, inputString);
				fh = Arrays.asList(firstHalf);
				sh =Arrays.asList(secondHalf);
				Collections.sort(fh);
				Collections.sort(sh);
				if(sh.equals(fh)){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			else{
				String[] firstHalf = MutableString.mutableString(0,(len/2), inputString);
				String[] secondHalf = MutableString.mutableString((len/2)+1,len, inputString);
				fh = Arrays.asList(firstHalf);
				sh = Arrays.asList(secondHalf);
				Collections.sort(fh);
				Collections.sort(sh);
				if(sh.equals(fh)){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}	
			}
		}
	}
}

class MutableString{
	public static String[] mutableString(int start,int end, String str){
		StringBuilder sb = new StringBuilder(str);
		String newStr = sb.substring(start, end);
		return newStr.toString().split("");
	}
}
