package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class catA {
	public static void main(String[] args) {
		catA run = new catA();
		run.run();
	}
	
	public void run() {
		String input = "/Sample.txt";
		File folder = new File("./src");
		File file = new File("./src" + input);
		String [] str = folder.list();
		
		for (String s: str) {
			System.out.println(s);
		}
		
		if(file.exists()) {
			show(file);
		} else {
			System.out.println("This file does not exists.");
		}
	}
	
	public void show(File file) {
		BufferedReader br = null;
		String line;
		try{
			br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e){
			System.out.println("File " + file + " does not exists!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
