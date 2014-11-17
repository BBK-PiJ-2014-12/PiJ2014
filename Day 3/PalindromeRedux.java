import java.util.Scanner;

public class PalindromeRedux{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 
		
		String text = in.nextLine();
		String str = "";
		
		for(int j=0; j<text.length(); j++){
			if(Character.isLetter(text.charAt(j))){
				str = str + Character.toLowerCase(text.charAt(j));
			}
		}
		
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