class PersonStoreQueue implements PersonQueue{
	private Person personQueue = null; 
	
	public void insertPerson(Person person){
		if(personQueue == null){
			personQueue = person;
		}else{
			personQueue.addPerson(person);
		}
	}
	
	public Person retrieve(){
		Person result = null;
		Person p = personQueue;
		while(p.getNextPerson().getNextPerson() != null){
			p = p.getNextPerson();
		}
		result = p.getNextPerson();
		p.setNextPerson(null);
		return result;
	}
	
	public void printQueue(){
		Person p = personQueue;
		while(p.getNextPerson() != null){
			System.out.println(p.getName());
			p = p.getNextPerson();
		}
		System.out.println(p.getName());
	}
}