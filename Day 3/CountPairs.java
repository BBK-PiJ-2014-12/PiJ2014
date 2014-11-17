import java.util.Scanner;

public class CountPairs{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the text you would like to search on:");
		String search = in.nextLine();
		
		System.out.println("Input text:");
		String text = in.next();
		
		int counter = 0;
		boolean flag = false;
		
		for(int i=0; i<(text.length()-search.length()+1); i++){
			if(text.charAt(i)==search.charAt(0)){
			flag = true;
				for(int j=0; j<search.length(); j++){
					if(text.charAt(i+j)!=search.charAt(j)){
						flag = false;
					}
				}
			if(flag){counter++;}
			flag = false;
			}
		}
		
		System.out.println("The term " + search + " was found " + counter + " times in the text.");
	}
}