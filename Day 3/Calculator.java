import java.util.Scanner;

class Calculator{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		double first = Integer.parseInt(in.nextLine());
		double second = Integer.parseInt(in.nextLine());
		
		System.out.println("Please select operation");
		System.out.println("1. Add");
		System.out.println("2. Negate");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		int choice = in.nextInt();
		
		if(choice!=1 && choice!=2 && choice!=3 && choice!=4){
			System.out.println("Invalid option");
		}else{
			if(choice == 1){System.out.println(first + second);}
			else if(choice == 2){System.out.println(first - second);}	
			else if(choice == 3){System.out.println(first * second);}
			else if(choice == 4){System.out.println(first / second);}
		}
	}

}