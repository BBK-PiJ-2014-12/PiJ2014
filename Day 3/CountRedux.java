import java.util.Scanner;

class CountRedux{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input text: ");
		String str = in.nextLine();
		
		String input = "";
		
		int check = 0;
		int counter = 0;
		
		while(check==0){
			System.out.print("Input letter: ");
			char c = in.next().charAt(0);
			
			for(int i=0; i<input.length(); i++){
				if(input.charAt(i) == c){
					check++;
				}
			}
			
			input = input + c;
			
			if(check==0){
				for(int j=0; j<str.length(); j++){
					if(str.charAt(j) == c){
						counter++;
					}
				}
				System.out.println("There are " + counter + " " + c + " in your text.");
				counter = 0;
			}
		}
		System.out.println("Repeated character. Exiting the program...");
		System.out.println("Thank you for your cooperation. Good bye!");
	}
}