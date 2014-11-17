import java.util.Scanner;

public class Text2number{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String text = in.next();
		
		String number = "";
		boolean flag = false;
		int counter = 0;
		
		for(int i=0;i<text.length();i++){
			if(Character.isDigit(text.charAt(i))){
				number = number + text.charAt(i);
			}
			if(text.charAt(i)=='.'){
				flag = true;
			}
			if(flag){
				counter++;
			}
		}
		int result = Integer.parseInt(number);
		double power = Math.pow(10,((counter - 1) * (-1)));
		System.out.println(result*power/2);
	}
}