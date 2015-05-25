package day16;

import java.io.File;

public class MakeDir {
	
	
	public static void main(String[] args) {
		File file = new File("./src");
		String [] str = file.list();
		
		for (String s: str) {
			System.out.println(s);
		}
		
		String newDir = "./src/day14";
		
		File d14 = new File(newDir);
		d14.mkdir();
		
		str = file.list();
		
		for (String s: str) {
			System.out.println(s);
		}
	}
}