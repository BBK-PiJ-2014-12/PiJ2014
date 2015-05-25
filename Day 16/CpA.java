package day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CpA {
	File file;
	File file2;
	
	public static void main(String[] args) {
		CpA cpa = new CpA();
		cpa.run();
	}
	public void run(){
		file = new File("./src/Sample.txt");
		file2 = new File("./src/Sample2.txt");
		if(file.exists()) {
			BufferedReader br = null;
			String line;
			ArrayList<String> strArray = new ArrayList<String>();
			int i = 0;
			try{
				br = new BufferedReader(new FileReader(file));
				while((line = br.readLine()) != null) {
					strArray.add(line);
					i++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try{
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
			System.out.println(strArray.get(0));
		
			PrintWriter pw = null;
			try{
				pw = new PrintWriter(file2);
				pw.write("Text");
				pw.println("println text");
				pw.flush();
				for(int j = 0; j < strArray.size(); j++) {
					pw.write("hahaha" + strArray.get(j));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pw.close();
			}
			
			
		}
	System.out.println("Finished!");
	}
}
