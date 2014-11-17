import java.util.Scanner;

class CountLettersB{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		System.out.println("Letter you are counting: ");
		char c = in.next().charAt(0);
		int counter = 0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == c){
				counter++;
			}
		}
		System.out.println(counter);
	}
}