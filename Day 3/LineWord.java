import java.util.Scanner;

class LineWord{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' '){
				System.out.println();
			}else{
				System.out.print(str.charAt(i));
			}
		}
	}
}