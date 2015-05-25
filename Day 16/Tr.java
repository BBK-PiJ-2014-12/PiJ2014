package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Tr {
	File file;
	File file2;
	BufferedReader br;
	String line = "";
	PrintWriter pw;
	
	public Tr() {
		
	}
	
	public static void main(String[] args) {
		Tr tr = new Tr();
		tr.run();
	}
	public void run(){
		file = new File("./src/tr.txt");
		file2 = new File("./src/trtemp.txt");
		if(!file2.exists()) {
			try{
				file2.createNewFile();
				br = new BufferedReader(new FileReader(file));
				pw = new PrintWriter(file2);
				
				while((line = br.readLine()) != null) {
					line = replaceWord(line);
					pw.println(line);
					pw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
					pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Finished!");
		file.delete();
		file2.renameTo(new File("./src/tr.txt"));
		System.out.println("Updated!");
	}
	
	private String replaceWord(String line) {
		String[] strArray = line.split(" ");
		line = "";
		for(int i = 0; i < strArray.length; i++) {
			if(strArray[i].equals("***")) {
				strArray[i] = "the";
			}
			line = line + " " + strArray[i];
		}
		return line.substring(1);
	}
}
