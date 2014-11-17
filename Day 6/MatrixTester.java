public class MatrixTester{
	public static void main(String[] args){
		Matrix m = new Matrix(2,3);
		
		System.out.println(m.toString());
		m.setElement(0,1,6);
		System.out.println(m.toString());
		m.setRow(1,"863542,82342,5482");
		System.out.println(m.toString());
	}
}