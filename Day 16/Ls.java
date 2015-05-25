package day16;

import java.io.File;

public class Ls {
	
	
	public static void main(String[] args) {
		File file = new File("./src");
		String [] str = file.list();
		
		for (String s: str) {
			System.out.println(s);
		}
		
	}
}
