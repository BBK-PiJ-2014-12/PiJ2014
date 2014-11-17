class ArrayCopierTest{
	public static void main(String[] args){
		int[] src = {1,2,3,4,5};
		int[] dst = new int[5];
		
		ArrayCopier copier = new ArrayCopier();
		
		dst = copier.copy(src); 
		
		for(int j=0;j<dst.length;j++){
			System.out.println(dst[j]);
		}
	}
}