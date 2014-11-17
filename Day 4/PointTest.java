class PointTest{
	public static void main(String[] args){
		Point London = new Point();
		London.x = 5;
		London.y = 6;
		Point Paris = new Point();
		Paris.x = 1;
		Paris.y = 1;
		Point Berlin = new Point();
		Berlin.x = 12;
		Berlin.y = 15;
		
		System.out.println(London.distanceTo(Paris));
		System.out.println(London.distanceToOrigin());
		London.moveTo(2,2);
		System.out.println(London.distanceToOrigin());
		London.moveTo(Berlin);
		System.out.println(London.distanceToOrigin());
		//System.out.println(Paris.clone());
	}
}