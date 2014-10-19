import java.util.Scanner;

class Maximising{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int temp = 0;
		int max = 0;
		
		do{
			temp = in.nextInt();
			if(temp>max){
				max = temp;
			}
		}while(temp != -1); 
		
		System.out.println(max);
	}
}