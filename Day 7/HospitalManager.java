public class HospitalManager{
private Patient patientListStart = null;

	/*public static void main(String[] args){
		HospitalManager hm = new HospitalManager();
		hm.startList();
	}*/
	
	public void startList(){
		Patient one = new Patient("John", 22, "Cold");
		patientListStart = one;
		Patient two = new Patient("Marry", 29, "Cold");
		patientListStart.addPatient(two);
		Patient three = new Patient("Maggie", 52, "Cold");
		patientListStart.addPatient(three);
		Patient four = new Patient("Brian", 37, "Cold");
		patientListStart.addPatient(four);
		Patient five = new Patient("Fred", 52, "Cold");
		patientListStart.addPatient(five);
		Patient six = new Patient("Ben", 16, "Cold");
		patientListStart.addPatient(six);
		Patient seven = new Patient("Kate", 48, "Cold");
		patientListStart.addPatient(seven);
		Patient eigth = new Patient("Eve", 21, "Cold");
		patientListStart.addPatient(eigth);
		
		patientListStart.printList();	
		patientListStart.deletePatient(four);
		System.out.println("After deleting Brian:");
		patientListStart.printList();
	}
	
	public void getPrintList(){
		patientListStart.printList();
	}
	/*public int countList(Patient patient){
		int count = 0;
		
		if(nextPatient == null){
			return count;
		}else{
			count++;
			nextPatient.countList(patient);
		}
	}*/
}