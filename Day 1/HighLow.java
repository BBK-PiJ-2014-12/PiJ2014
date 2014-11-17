import java.util.Scanner;

class HighLow{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int lastnum = 0;
		int newnum; 
		boolean flag = true; 
		
		lastnum = in.nextInt(); 
		
		if(lastnum != -1){
			
			while(true){
				newnum = in. nextInt();
				if(newnum == -1){break;}
				if(newnum - lastnum != 1 && newnum - lastnum != -1){
					flag = false;
				}
				lastnum = newnum;
			}
		}
		
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}