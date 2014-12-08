import java.util.Scanner;

public class DoWhile{
	public static int distinction = 0;
	public static int pass = 0;
	public static int fail = 0;
	public static int invalid = 0;
	private int mark;
	
	Scanner in = new Scanner(System.in);
	
	public void readIn(){
		do{
			mark = in.nextInt();
			if(mark>100){invalid++;}
			else if (mark>70){distinction++;}
			else if (mark>50){pass++;}
			else if (mark>0){fail++;}
			else if (mark<-1){invalid++;}
		}
		while(mark != -1);
		
		System.out.println("There are " + (distinction + pass + fail + invalid) + " students: " + distinction + " distinctions, " + pass + " pass, " + fail + " fails (plus " + invalid + " invalid).");
	}
	
	
	public static void main(String[] args){
		
		DoWhile dw = new DoWhile();
		
		dw.readIn();
	}
}