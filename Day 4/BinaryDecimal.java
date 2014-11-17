import java.util.Scanner;

public class BinaryDecimal{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("1. Binary to decimal");
		System.out.println("2. Decimal to binary");
		int opt = in.nextInt();
		
		if(opt == 1){
			System.out.println("Input a binary number");
			String binary = in.next();
			binaryToDecimal(binary);
		}
		if(opt == 2){
			System.out.println("Input a decimal number");
			int decimal = in.nextInt();
			decimalToBinary(decimal);
		}
		
		
	}
	public static void binaryToDecimal(String binary){
		int dec = 0;
		
		for(int i=0;i<binary.length();i++){
			int n = Integer.parseInt(binary.substring(binary.length()-i-1,binary.length()-i));
			dec = dec + (int)(Math.pow(n*2,i));
		}
		System.out.println(dec);
	}
	
	public static void decimalToBinary(int decimal){
		String bin = "";
		
		while(decimal>0){
			bin = decimal%2 + bin;
			decimal = (decimal-(decimal%2))/2;
		}
		System.out.println(bin);
	}
}