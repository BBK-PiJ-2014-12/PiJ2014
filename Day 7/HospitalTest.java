public class HospitalTest{
	public static void main(String[] args){
		HospitalManager hm = new HospitalManager();
		hm.startList();
		
		System.out.println("");		
		System.out.println("This is from the main method:");		
		hm.getPrintList();
		
		//System.out.println(hm.countList(patientListStart));
	}
}