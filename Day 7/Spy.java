public class Spy{
	public static int spyCount = 0;
	private int spyID = 0;
	
	public Spy(int ID){
		this.spyID = ID;
		spyCount++;
		System.out.println("Spy ID: " + ID);
		System.out.println("So far you have " + spyCount + " spys in the agency.");
	}
	
	public void die(){
		System.out.println("Spy " + this.spyID + " konyec!");
		spyCount--;
	}
	
	public static void main(String[] args){
		Spy s001 = new Spy(456845);
		Spy s002 = new Spy(786728);
		Spy s003 = new Spy(786786);
		Spy s004 = new Spy(444494);
		Spy s005 = new Spy(343418);
		Spy s006 = new Spy(876543);
		Spy s007 = new Spy(678922);
		
		s007.die();
		s004.die();
	}
}