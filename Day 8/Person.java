class Person{
	private String firstName;
	private Person nextPerson;
	
	public Person(String firstName){
		this.firstName = firstName;
	}
	
	public String getName(){
		return firstName;
	}
	
	public Person getNextPerson(){
		return nextPerson;
	}
	
	public void setName(String name){
		this.firstName = name;
	}	
	
	public void setNextPerson(Person person){
		this.nextPerson = person;
	}
	
	public void addPerson(Person person){
		if(this.nextPerson == null){
			this.nextPerson = person;
		}else{
			this.nextPerson.addPerson(person);
		}
	}
}