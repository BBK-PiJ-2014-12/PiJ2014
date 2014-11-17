class Calculator{
	public static void main(String[] args){
		int first = 42;
		int second = 5;
		
		Calculator calc = new Calculator();
		
		calc.add(first, second);
		calc.subtract(first, second);
		calc.multiply(first, second);
		calc.divide(first, second);
		calc.modulus(first, second);
	}
	
	public void add(int first, int second){
		System.out.println(first + second);
	}
	public void subtract(int first, int second){
		System.out.println(first - second);
	}
	public void multiply(int first, int second){
		System.out.println(first * second);
	}
	public void divide(int first, int second){
		double dfirst = (double) first;
		double dsecond = (double) second;
		System.out.println(dfirst / dsecond);
	}
	public void modulus(int first, int second){
		double dfirst = (double) first;
		double dsecond = (double) second;
		System.out.println((int)(dfirst / dsecond));
	}
}