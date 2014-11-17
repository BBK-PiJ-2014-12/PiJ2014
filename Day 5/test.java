import java.util.Scanner;

class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String text = in.next();
		
		System.out.println(checkPalindrome(text));
	}
	
	public static boolean checkPalindrome(String text){
		if(text.length() <= 2){
			return true;
		}
		System.out.println(text);
		if(text.charAt(0) == text.charAt(text.length()-1)){
			checkPalindrome(text.substring(1,text.length()-1));
		}
		return false;
	}
}