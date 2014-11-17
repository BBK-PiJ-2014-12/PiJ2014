class ArrayCopier{
	public static int[] copy(int[] src){
		int[] dst = new int[3];
		
		if(dst.length<src.length){
			for(int i=0;i<dst.length;i++){
				dst[i] = src[i];
			}
		}
		else if(dst.length>src.length){
			for(int i=0;i<src.length;i++){
				dst[i] = src[i];
			}
			for(int j=src.length;j<dst.length;j++){
				dst[j] = 0;
			}
		}else{
			for(int i=0;i<dst.length;i++){
				dst[i] = src[i];
			}
		}
		
		return dst;
	}
}