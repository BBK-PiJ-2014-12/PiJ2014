class Paper{
	int sizeA = 841;
	int sizeB = 1189;

	public Paper up(Paper p){
		if(sizeA < sizeB){
			p.sizeA = sizeA * 2;
		}else{
			p.sizeB = sizeB * 2;
		}
		return p;
	}

	public Paper down(Paper p){
		if(sizeA > sizeB){
			p.sizeA = sizeA / 2;
		}else{
			p.sizeB = sizeB / 2;
		}
		return p;
	}
	
	public Paper paperSize(String type){
		if(type.equals("A0")){
			return this;
		}
		if(Integer.parseInt(type.substring(1)) != 0){
			return (this.down(paperSize("A" + (Integer.parseInt(type.substring(1))-1))));
		}
		if(Integer.parseInt(type.substring(1)) == 0){
			return (this.up((paperSize(type.substring(0,type.length()-1)))));
		}		
		return this;
	}
}