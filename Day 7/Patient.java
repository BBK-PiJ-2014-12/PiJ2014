public class Patient{
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness){
		this.name = name; 
		this.age = age;
		this.illness = illness;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getIllness(){
		return illness;
	}
	
	public void addPatient(Patient patient){
		if(nextPatient == null){
			nextPatient = patient;
		}else{
			nextPatient.addPatient(patient);
		}
	}
	
	public boolean deletePatient(Patient patient){
		if(nextPatient == null){
			return false;
		}else if(nextPatient.name.equals(patient.getName())){
			nextPatient = nextPatient.getNext();
			return true;
		}else{
			return nextPatient.deletePatient(patient);
		}
	}
	
	public Patient getNext() {
		return nextPatient;
	}
	
	public void printList(){
		System.out.println(getName() + ", " + getAge() + ", " + getIllness());
		if(nextPatient != null){
			nextPatient.printList();
		}
	}
}