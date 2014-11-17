import java.util.Scanner;

class Line{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		for(int i=0; i<str.length(); i++){
			System.out.println(str.charAt(i));
		}
	}
}