import java.util.Scanner; 


class Spy{

	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in); 
		String str = in.nextLine();
		int number = Integer.parseInt(str);
		int counter = 2;
		boolean flag = true;
		
		while(counter<number){
			if(number%counter==0){
				flag = false;				
			}	
			counter++;
		}
		
		if(flag){
			System.out.println("Prime");
		}else{
			System.out.println("Not prime");
		}
	}
}