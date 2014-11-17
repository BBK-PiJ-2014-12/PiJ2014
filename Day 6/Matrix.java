class Matrix{
	int[][] m;
	
	public Matrix(int x, int y){
		this.m = new int[x][y];
		
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				m[i][j] = 1;
			}
		}
	}
	
	public void setElement(int i, int j, int value){
		if(i < this.m.length && j < this.m[0].length){
			this.m[i][j] = value;
		}
	}
	
	public void setRow(int a, String row){
		int counter = 0;
		boolean flag = true;
		
		for(int i=0;i<row.length();i++){
			if(row.charAt(i)==','){
				counter++;
			}
			if(!Character.isDigit(row.charAt(i))){
				if(row.charAt(i)!=','){
					flag = false;
				}
			}
		}
		
		if(flag && a >= this.m.length && counter + 1 == this.m[0].length){
			int[] r = new int[this.m[0].length];
			int j = 0; 
			String str = "";
			
			for(int i=0;i<row.length();i++){
				if(row.charAt(i)!=','){
					str = str + row.charAt(i);
				}else{
					r[j] = Integer.parseInt(str);
					j++;
					str = "";
				}
			}
			r[j] = Integer.parseInt(str);
		
			for(int i=0;i<r.length;i++){
				this.m[a][i] = r[i];
			}
		}
	}
	
	public void setColumn(int 
	
	public String toString(){
		String str = "["; 
		
		for(int i=0;i<m.length;i++){
			String line = "";
			for(int j=0;j<m[0].length;j++){
				line = line + "," + (m[i][j]);
			}
			str = str + line.substring(1) + ";";
		}
		
		return (str.substring(0,(str.length()-1)) + "]");
	}
	
}