package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ToScreen {
	File f;
	
	public ToScreen(File f) {
		this.f = f;
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
