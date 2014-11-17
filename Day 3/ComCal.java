import java.util.Scanner;

class ComCal{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String operation = in.nextLine(); 
		
		for(int i=0;i<operation.length();i++){ 	  
			if(operation.charAt(i) == '+' || operation.charAt(i) == '-' || operation.charAt(i) == '*' || operation.charAt(i) == '/'){
				if(operation.charAt(i) == '+'){
					System.out.println(Double.parseDouble(operation.substring(0,i)) + Double.parseDouble((operation.substring(i+1))));					
				}
				if(operation.charAt(i) == '-'){
					System.out.println(Double.parseDouble(operation.substring(0,i)) - Double.parseDouble((operation.substring(i+1))));					
				}
				if(operation.charAt(i) == '*'){
					System.out.println(Double.parseDouble(operation.substring(0,i)) * Double.parseDouble((operation.substring(i+1))));					
				}
				if(operation.charAt(i) == '/'){
					System.out.println(Double.parseDouble(operation.substring(0,i)) / Double.parseDouble((operation.substring(i+1))));					
				}
			}
		}
	}
}