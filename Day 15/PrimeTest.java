package day15;

public class PrimeTest {
	public static void main(String[] args) {
		PrimeDivisorList pdl = new PrimeDivisorList();
		try{
			System.out.println("Start");
			pdl.add(7);
			pdl.add(17);
			pdl.add(31);
			pdl.add(19);
			pdl.add(null);
			pdl.add(2);
			System.out.println("Finish");
		} catch (NullPointerException e) {
			System.out.println("Do not input null!");
		} catch (IllegalArgumentException e) {
			System.out.println("Only prime numbers can be added"); 
		}
		System.out.println(pdl.toString());
	}
}
