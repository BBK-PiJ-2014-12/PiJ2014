import java.util.Scanner;

public class Mortgage{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Amount: ");
		double borrowed = in.nextDouble();
		System.out.println("Years: ");
		int years = in.nextInt();
		System.out.println("Rate: ");
		double rate = in.nextDouble();
		
		System.out.println(totalToBePaid(borrowed, years, rate));
		System.out.println(yearlyPaid(borrowed, years, rate));
		System.out.println(interestPaid(borrowed, years, rate));
	}
	
	public static Double totalToBePaid(double borrowed, int years, double rate){
		return borrowed*(Math.pow((1 + (rate/100)),years));
	}
	
	public static Double yearlyPaid(double borrowed, int years, double rate){
		return borrowed*(Math.pow((1 + (rate/100)),years))/years;
	}
	
	public static int interestPaid(double borrowed, int years, double rate){
		System.out.println(borrowed*((Math.pow((1 + (rate/100)),years))-1));
		System.out.println(borrowed*(Math.pow((1 + (rate/100)),years))/years);
		return (int)((borrowed*((Math.pow((1 + (rate/100)),years))-1))/(borrowed*(Math.pow((1 + (rate/100)),years))/years)) + 1;
	}
}