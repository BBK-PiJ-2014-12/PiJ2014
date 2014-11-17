import java.util.Scanner;

public class PalindromeCreator{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		String result = str;
		
		for(int i=0; i<str.length(); i++){
			result = result + str.charAt(str.length()-i-1);
		}
		System.out.println(result);
	}
}