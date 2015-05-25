package day15;

import java.util.Scanner;

public class UserInput2 {
	public static void main(String[] args) {
		UserInput2 ui = new UserInput2();
		ui.launch();	
		ui.sc.close();
	}
	
	public UserInput2(){
		sc= new Scanner(System.in);
	}
	
	Scanner sc;
	public void launch() {
		int[] container = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Number " + (i + 1) + ":");
			try{
				container[i] = readInInt();
			}catch (Exception ex) {
				System.out.println("This is not an integer!");
				i--;
			}
		} 		
		System.out.println("The total is: " + addUpArray(container));
	}
	
	public int addUpArray(int[] container) {
		int result = 0;
		for(int i = 0; i < container.length; i++) {
			result = result + container[i];
		}
		return result;
	}
	
	public int readInInt() throws Exception {
		String str = sc.next();
		int number = 0;
			number = Integer.parseInt(str); 
		return number; 
	}
}
