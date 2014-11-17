import java.util.Scanner;

class CountLetters{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		int counter = 0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 'e'){
				counter++;
			}
		}
		System.out.println(counter);
	}
}