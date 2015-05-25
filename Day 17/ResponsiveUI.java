package day17;
import java.util.Scanner;

public class ResponsiveUI {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ResponsiveUI rui = new ResponsiveUI();
		rui.run();
	}
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print("Input " + (i + 1) + " : ");
			String str = sc.nextLine();
		}
	}
	
	
}
