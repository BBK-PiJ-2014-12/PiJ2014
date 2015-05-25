package day15;

public class Patient {
	String name; 
	int age; 
	
	public Patient(String name, int age) throws IllegalArgumentException {
		this.name = name;
		this.age = age;
		
		if(age < 0 || 130 < age) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void main (String[] args) {
		try{
			Patient p = new Patient("Marko", 999); 
		} catch (IllegalArgumentException e) {
			System.out.println("Works!");
		}
	}
}
