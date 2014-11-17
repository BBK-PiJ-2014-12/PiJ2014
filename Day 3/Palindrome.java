import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 
		
		String str = in.next();
		boolean flag = true;
		int i = 0;
		
		while(i<str.length()-i-1 && flag==true){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				flag = false;
			}
			i++;
		}
		System.out.println(flag);
	}
}