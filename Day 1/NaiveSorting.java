import java.util.Scanner;

class NaiveSorting{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int N1 = 0;
		int N2 = 0;
		int N3 = 0;
		int temp = 0;
		
		N1 = in.nextInt();
		temp = in.nextInt();
		
		if(temp<N1){
			N2 = N1;
			N1 = temp;
		}else{
			N2 = temp;
		}
		
		temp = in.nextInt();
		
		if(temp<N1){
			N3 = N2;
			N2 = N1;
			N1 = temp;
		}else if(temp<N2){
			N3 = N2;
			N2 = temp;
		}else{
			N3 = temp;
		}
		
		System.out.println(N1 + ", " + N2 + ", " + N3);
	}
}