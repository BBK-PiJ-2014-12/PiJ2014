import java.util.Scanner;

public class Distance{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		Point one = new Point();
		Point two = new Point();
		Point three = new Point();
		
		one.x = in.nextDouble();
		one.y = in.nextDouble();
		two.x = in.nextDouble();
		two.y = in.nextDouble();
		three.x = in.nextDouble();
		three.y = in.nextDouble();
		
		double a = Math.sqrt(Math.pow((one.x - two.x),2) + Math.pow((one.y - two.y),2));
		double b = Math.sqrt(Math.pow((one.x - three.x),2) + Math.pow((one.y - three.y),2));
		double c = Math.sqrt(Math.pow((three.x - two.x),2) + Math.pow((three.y - two.y),2));
		
		double min = b; 
		
		if(a<b){
			 min = a;
		}
		if(c<min){
			min = c;
		}
		System.out.println(min);
	}
}