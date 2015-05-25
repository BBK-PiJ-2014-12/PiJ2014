package day15;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		UserInput ui = new UserInput();
		ui.launch();	
		
	}
	
	public void launch() {
		Scanner sc = new Scanner(System.in);
		int[] container = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Number " + (i + 1) + ":");
			String str = sc.next();
			int number = 0;
			try{
				number = Integer.parseInt(str); 
				container[i] = number;
			}catch (Exception ex) {
				System.out.println("This is not an integer!");
				i--;
			}
		}
		System.out.println("The total is: " + addUpArray(container));
		sc.close();
	}
	
	public int addUpArray(int[] container) {
		int result = 0;
		for(int i = 0; i < container.length; i++) {
			result = result + container[i];
		}
		return result;
	}
}
