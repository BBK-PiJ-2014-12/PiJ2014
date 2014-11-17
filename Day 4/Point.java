class Point{
	double x;
	double y;
	
	double distanceTo(Point P){
		return Math.sqrt(Math.pow(this.x - P.x,2) + Math.pow(this.y - P.y,2));
	}
	
	double distanceToOrigin(){
		return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
	}
	
	void moveTo(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	void moveTo(Point P){
		this.x = P.x;
		this.y = P.y; 
	}
	
	// clone() is inherited from Objects
	
	/*Point opposite(){
		return Point(this.x * -1, this.y * -1);
	}*/
	
}