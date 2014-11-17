import java.util.Scanner;

class Change{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		double price = Double.parseDouble(in.nextLine());
		double given = Double.parseDouble(in.nextLine());
		double change = (given - price)*100;
		
		if(change/5000>1){
			System.out.println("£50: " + (change-change%5000)/5000); 
			change = change%5000;
		}if(change/2000>1){
			System.out.println("£20: " + (change-change%2000)/2000); 
			change = change%2000;
		}if(change/1000>1){
			System.out.println("£10: " + (change-change%1000)/1000); 
			change = change%1000;
		}if(change/500>1){
			System.out.println("£5: " + (change-change%500)/500); 
			change = change%500;
		}if(change/200>1){
			System.out.println("£2: " + (change-change%200)/200); 
			change = change%200;
		}if(change/100>1){
			System.out.println("£1: " + (change-change%100)/100); 
			change = change%100;
		}if(change/50>1){
			System.out.println("50p: " + (change-change%50)/50); 
			change = change%50;
		}if(change/20>1){
			System.out.println("20p: " + (change-change%20)/20); 
			change = change%20;
		}if(change/10>1){
			System.out.println("10p: " + (change-change%10)/10); 
			change = change%10;
		}if(change/5>1){
			System.out.println("5p: " + (change-change%5)/5); 
			change = change%5;
		}if(change/2>1){
			System.out.println("2p: " + (change-change%2)/2); 
			change = change%2;
		}if(change/1>1){
			System.out.println("1p: " + (change-change%1)/1); 
			change = change%1;
		}
		
		System.out.println(change/100); 
	}
}