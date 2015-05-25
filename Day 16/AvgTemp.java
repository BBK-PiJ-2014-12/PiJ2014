package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AvgTemp {
	File file;
	BufferedReader br;
	String line = "";
	PrintWriter pw;
	
	public AvgTemp() {
		
	}
	
	public static void main(String[] args) {
		AvgTemp av = new AvgTemp();
		av.run();
	}
	public void run(){
		file = new File("./src/avgtemp.csv");
		if(file.exists()) {
			try{
				br = new BufferedReader(new FileReader(file));
				double linetotal = 0; 
				double linecounter = 0;
				double totaltotal = 0;
				double totalcounter = 0; 
				
				while((line = br.readLine()) != null) {
					String[] strArray = line.split(", ");
					//int[] intArray = new int[strArray.length];
					for(int i = 0; i < strArray.length; i++) {
						linetotal = linetotal + Double.parseDouble(strArray[i]);
						linecounter++;
						totalcounter++;
						System.out.print(strArray[i] + " ");
					}
					totaltotal = totaltotal + linetotal;
					
					System.out.println("Line " + totalcounter + ": " + linetotal/linecounter);
					linetotal = 0; 
					linecounter = 0;
				}
				System.out.println("The average of the file is " + totaltotal/totalcounter);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
					//pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
