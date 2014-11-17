class Hanoi{
	public static void main(String[] args){
		int discs = 6;
		
		System.out.println(moves(discs));
	}
	
	public static int moves(int discs){
		if(discs == 1){
			return 1;
		}
		return (moves(discs - 1)*2 + 1);
	}
}