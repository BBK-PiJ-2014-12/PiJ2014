class Power{
	public static void main(String[] args){
		int base = 4;
		int exponent = 5;
		
		System.out.println(pow(base,exponent));
	}
	
	public static int pow(int base, int exponent){
		if(exponent == 1){
			return base;
		}
		return pow(base, exponent - 1) * base;
	}
}