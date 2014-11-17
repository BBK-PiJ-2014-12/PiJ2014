class Fibonacci{
	public static void main(String[] args){
		int element = 7;
		
		System.out.println(fibonacci(element));
	}
	
	public static int fibonacci(int element){
		if(element == 1 || element == 2){
			return 1;
		}
		return fibonacci(element - 1) + fibonacci(element - 2);
	}
}