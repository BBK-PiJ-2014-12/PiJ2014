package day15;

import java.util.ArrayList;

public class PrimeDivisorList {
	ArrayList<Integer> myList;  
	
	public PrimeDivisorList() {
		myList = new ArrayList<Integer>();
	}
	
	public void add(Integer num) {
		//System.out.println(num);
		if(num == null) {
			throw new NullPointerException();
		}else if (!isPrime(num)){
			throw new IllegalArgumentException();
		}else {
			//System.out.println(num);
			myList.add(num);
		}
	}
	
	private boolean isPrime(Integer num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		String str = "" + myList.get(0);
		int result = myList.get(0); 
		
		for(int i = 1; i < myList.size(); i++) {
			str = str + " * " + myList.get(i);
			result = result * myList.get(i);
		}
		return str + " = " + result;
	}
}
