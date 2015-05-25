package day15;
import java.util.ArrayList;

public class CodeFlow {
	public static void main(String[] args) {
		CodeFlow cf = new CodeFlow(); 
		cf.launch(6); 
	}
	
	public void launch(int userinput) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		try {
			intList.remove(0);
			System.out.println(intList.get(userinput));
			intList.remove(0);
			System.out.println(intList.get(userinput));			
			intList.remove(0);
			System.out.println(intList.get(userinput));
			intList.remove(0);
			System.out.println(intList.get(userinput));
			intList.remove(0);
			System.out.println(intList.get(userinput));
			intList.remove(0);
			System.out.println(intList.get(userinput));
			intList.remove(0);
			System.out.println(intList.get(userinput));
		}catch (Exception ex) {
			ex.printStackTrace();
//		}catch (NullPointerException ex) {
//			ex.printStackTrace();
		}
	}
}
